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

    int sumCounts(String filename) throws IOException {
        ArrayList<String> sortedGroupsWithoutDoubles = removeDoubles(filename);
        int sumOfCounts = 0;
        for (String group : sortedGroupsWithoutDoubles) {
            sumOfCounts = sumOfCounts += group.length();
        }
        return sumOfCounts;
    }

    ArrayList <String> findAnswersInCommonPerGroup(String filename) throws IOException {
        ArrayList<String> groups = splitInputIntoGroups(filename);
        System.out.println(groups);
        ArrayList<String> answersInCommon = new ArrayList<>();
        for (String group : groups) {
            String[] groupAsArray = group.split(" ");
            ArrayList<String> sortedGroupAsArray = new ArrayList<>();
            for (String person : groupAsArray) {
                char[] personCharArray = person.toCharArray();
                Arrays.sort(personCharArray);
                String sortedPerson = Arrays.toString(personCharArray).replace(", ", "");
                System.out.println("sortedPerson: " + sortedPerson);
//                person = sortedPerson;
                sortedGroupAsArray.add(sortedPerson);
            }
            System.out.println("Test 10: " + sortedGroupAsArray);

//            for (int i = 0; i < sortedGroupAsArray.size(); i++) {
//                ArrayList<Character> groupAnswersInCommon = new ArrayList<>();
//                for (int j = 0; j < sortedGroupAsArray.get(i).length(); j++) {
//                    // sortedGroupAsArray.get(i).charAt(j) (current character) is in every array in the list,
//                    // push it to groupAnswersInCommon
//                    for (int k = 0; k < sortedGroupAsArray.size(); k++) {
//                        String currentCharAsString = Character.toString(sortedGroupAsArray.get(i).charAt(j));
//                        if (sortedGroupAsArray.get(k).contains(currentCharAsString)) {
//                            groupAnswersInCommon.add(sortedGroupAsArray.get(i).charAt(j));
//                        }
//                    }
//                }
//                StringBuilder groupAnswersInCommonString = new StringBuilder();
//                for (Character c : groupAnswersInCommon) {
//                    groupAnswersInCommonString.append(c);
//                }
//                answersInCommon.add(groupAnswersInCommonString.toString());
//            }

            for (int i = 1; i < sortedGroupAsArray.size(); i++) {
                String lettersToCheckFor = sortedGroupAsArray.get(0);
                char[] lettersToCheckForArray = lettersToCheckFor.toCharArray();
//                for (int j = 0; j < sortedGroupAsArray.get(i).length(); j++) {
//                    if (sortedGroupAsArray.get(i).charAt(j))
//                }
                for (char letter : lettersToCheckForArray) {
                    // why do I keep nesting a billion loops... I have no idea what's happening, do I?
//                    for (int j = 0; j < sortedGroupAsArray.size(); j++) {
//
//                    }
                // check for each letter in each array (sortedGroupAsArray.get(i))
                    boolean isLetterInEveryArray = true;
                    // I'm already iterating through this...
                    for (int j = 1; j < sortedGroupAsArray.size(); j++) {
                        if (!sortedGroupAsArray.get(j).contains(String.valueOf(letter))) {
                            isLetterInEveryArray = false;
                        }
                    }
                    if (isLetterInEveryArray) {
                        answersInCommon.add(String.valueOf(letter));
                    }
                }
            }

        }
        System.out.println("answersInCommon: " + answersInCommon);
        return answersInCommon;
    }
}
