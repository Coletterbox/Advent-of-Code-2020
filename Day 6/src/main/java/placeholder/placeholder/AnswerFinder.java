package placeholder.placeholder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class AnswerFinder {
    // really this isn't the only function that belongs in this class, but I've primarily made it so that I have somewhere to rewrite this garbage

    ArrayList<String> findAnswersInCommonPerGroup(String filename) throws IOException {
        InputParser inputParser = new InputParser();
        ArrayList<String> groups = inputParser.splitInputIntoGroups(filename);
        System.out.println(groups);
        ArrayList<String> answersInCommon = new ArrayList<>();
        for (String group : groups) {
            ArrayList<Character> answersPerGroup = new ArrayList<>();
            String[] groupAsArray = group.split(" ");
            System.out.println(Arrays.toString(groupAsArray));
            String lettersToCheckFor = groupAsArray[0];
            char[] lettersToCheckForArray = lettersToCheckFor.toCharArray();
            for (char letter : lettersToCheckForArray) {
                // check for each letter in each array (sortedGroupAsArray.get(i))
                boolean isLetterInEveryArray = true;
                for (int j = 1; j < groupAsArray.length; j++) {
                    if (!groupAsArray[j].contains(String.valueOf(letter))) {
                        isLetterInEveryArray = false;
                    }
                }
                if (isLetterInEveryArray) {
//                    answersInCommon.add(String.valueOf(letter));
                    answersPerGroup.add(letter);
                }
            }
            StringBuilder answersPerGroupString = new StringBuilder();
            for (Character letter : answersPerGroup) {
                answersPerGroupString.append(letter);
            }
            answersInCommon.add(answersPerGroupString.toString());
        }
        System.out.println("answersInCommon: " + answersInCommon);
        return answersInCommon;
    }

    int sumCounts(String filename) throws IOException {
        ArrayList<String> answersInCommon = findAnswersInCommonPerGroup(filename);
        int sum = 0;
        for (String answers : answersInCommon) {
            sum+=answers.length();
        }
        return sum;
    }
}
