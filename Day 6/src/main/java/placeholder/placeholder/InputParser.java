package placeholder.placeholder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class InputParser {
    ArrayList<String> convertInput(String filename) throws IOException {
        ArrayList<String> inputAsArrayList = new ArrayList<String>();
        BufferedReader reader;
        reader = new BufferedReader(new FileReader(filename));
        String line = reader.readLine();
        while (line != null) {
            inputAsArrayList.add(line);
            line = reader.readLine();
        }
        inputAsArrayList.add("");
        reader.close();
        System.out.println(inputAsArrayList);
        return inputAsArrayList;
    }

//    public void parseInput(String filename) throws IOException {
//        ArrayList<String> inputAsArrayList = convertInput(filename);
//        // array of questions
//        // question count
//    }

    ArrayList<String> splitInputIntoGroups(String filename) throws IOException {
        
        ArrayList<String> inputAsArrayList = convertInput(filename);

//        ArrayList<String> groups = new ArrayList<>(inputAsArrayList.size());

//        groups.add(inputAsArrayList.get(0));
//        int groupsIndex = 0;
//        for (int i = 1; i < inputAsArrayList.size(); i++) {
//            String previousLine = inputAsArrayList.get(i-1);
//            String currentLine = inputAsArrayList.get(i);
//            if (currentLine.length() > 0 && previousLine.length() > 0) {
//                groups.add("");
//                String newLine = groups.get(groupsIndex) + currentLine;
//                System.out.println(newLine);
//                groups.add(groupsIndex, newLine);
//            } else {
//                groups.add("");
//                groupsIndex++;
//            }
//        }

        ArrayList<String> groups = new ArrayList<String>();
        int groupsIndex = 0;
        for (int i = 0; i < inputAsArrayList.size(); i++) {
            if (i == 0) {
                groups.add(inputAsArrayList.get(i));
            } else {
                if (inputAsArrayList.get(i).length() > 0 && inputAsArrayList.get(i-1).length() > 0) {
                    groups.add("");
                    groups.set(groupsIndex, groups.get(groupsIndex) + " " + inputAsArrayList.get(i));
                } else if (inputAsArrayList.get(i).length() > 0 && inputAsArrayList.get(i-1).length() == 0) {
                    groups.add("");
                    groups.set(groupsIndex, inputAsArrayList.get(i));
                } else if (inputAsArrayList.get(i).length() == 0) {
                    groupsIndex++;
                }
            }
        }
        System.out.println(groups);
        return groups;
    }

    ArrayList<String> formatAnswers(String filename) throws IOException {
        ArrayList<String> groups = splitInputIntoGroups(filename);
        ArrayList<String> sortedGroups = new ArrayList<>();
        for (String group : groups) {
            char[] charArray = group.replace(" ", "").toCharArray();
            Arrays.sort(charArray);
            sortedGroups.add(new String(charArray));
        }
        System.out.println("groups: " + sortedGroups);
        return sortedGroups;
    }

    ArrayList<String> removeDoubles(String filename) throws IOException {
        ArrayList<String> sortedGroups = formatAnswers(filename);
        ArrayList<String> sortedGroupsWithoutDoubles = new ArrayList<>();
        for (String group : sortedGroups) {
            if (group.length() > 0) {
                StringBuilder groupWithoutDoubles = new StringBuilder();
                groupWithoutDoubles.append(group.charAt(0));
                for (int i = 1; i < group.length(); i++) {
                    if (group.charAt(i) != group.charAt(i-1)) {
                        groupWithoutDoubles = new StringBuilder(groupWithoutDoubles.toString() + group.charAt(i));
                    }
                }
                sortedGroupsWithoutDoubles.add(groupWithoutDoubles.toString());
            }
        }
        System.out.println("groups without doubles: " + sortedGroupsWithoutDoubles);
        return sortedGroupsWithoutDoubles;
    }
}
