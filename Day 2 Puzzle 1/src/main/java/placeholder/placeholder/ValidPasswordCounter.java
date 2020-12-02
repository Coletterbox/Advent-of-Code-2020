package placeholder.placeholder;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ValidPasswordCounter {
    public static int countValidPasswords() throws FileNotFoundException {
        InputParser inputParser = new InputParser();
        ArrayList<String> inputArray = inputParser.makeInputIntoArray();
        int validPasswordCount = 0;
        for (int i = 0; i < inputArray.size(); i+=3) {
            // inputArray[i] is the range
            String range = inputArray.get(i);
            // TODO: Fix this!! Not all numbers are one digit.
//            char minimumAsChar = range.charAt(0);
//            int minimum = Character.getNumericValue(minimumAsChar);
//            char maximumAsChar = range.charAt(2);
//            int maximum = Character.getNumericValue(maximumAsChar);

            String[] rangeArray = range.split("-");
            String minimumAsString = rangeArray[0];
            String maximumAsString = rangeArray[1];
            int minimum = Integer.parseInt(minimumAsString);
            int maximum = Integer.parseInt(maximumAsString);

            // first character of inputArray[i+1] is the letter
            char letter = inputArray.get(i + 1).charAt(0);
            // inputArray[i+2] is the password
            int instancesOfChar = 0;
            for (int j = 0; j < inputArray.get(i + 2).length(); j++) {
                if (letter == inputArray.get(i + 2).charAt(j)) {
                    instancesOfChar++;
                }
            }
            if (instancesOfChar >= minimum && instancesOfChar <= maximum) {
                validPasswordCount++;
            }
        }
        System.out.println("Number of valid passwords: " + validPasswordCount);
        return validPasswordCount;
    }
}
