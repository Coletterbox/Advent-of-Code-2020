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
        
//        for (String line : inputAsArrayList) {
//            if (!line.matches("") && ) {
//
//            }
//        }

//        int groupsIndex = 0;
//        for (int i = 1; i < inputAsArrayList.size(); i++) {
//            String previousLine = inputAsArrayList.get(i-1);
//            String currentLine = inputAsArrayList.get(i);
//            if (!currentLine.matches("") && !previousLine.matches("")) {
//                String newLine = groups.get(groupsIndex) + currentLine;
//                groups.add(groupsIndex, newLine);
//                System.out.println(newLine);
//            } else if (currentLine.matches("")) {
//                groupsIndex++;
//            }
//        }

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
                    groupsIndex++;
                    groups.add("");
                    groups.set(groupsIndex, inputAsArrayList.get(i));
                } else if (inputAsArrayList.get(i).length() == 0) {
                    groupsIndex++;
                }
            }
        }
        return groups;
    }
}
