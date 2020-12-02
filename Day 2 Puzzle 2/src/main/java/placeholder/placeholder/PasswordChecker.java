package placeholder.placeholder;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class PasswordChecker {
    public static int checkPasswords() throws FileNotFoundException {
        InputParser inputParser = new InputParser();
        ArrayList<String> inputArray = inputParser.makeInputIntoArray();
        int validPasswordCount = 0;
        for (int i = 0; i < inputArray.size(); i+=3) {
            // inputArray[i] is the list of positions
            String positions = inputArray.get(i);
            String[] positionsArray = positions.split("-");
            String firstPositionString = positionsArray[0];
            String secondPositionString = positionsArray[1];
            int firstPosition = Integer.parseInt(firstPositionString);
            int secondPosition = Integer.parseInt(secondPositionString);
            // the positions are not zero indexed
            firstPosition--;
            secondPosition--;
            // first character of inputArray[i+1] is the letter
            char letter = inputArray.get(i + 1).charAt(0);
            // inputArray[i+2] is the password
            if (inputArray.get(i + 2).charAt(firstPosition) == letter ^ inputArray.get(i + 2).charAt(secondPosition) == letter) {
                validPasswordCount++;
            }
        }
        System.out.println("Number of valid passwords: " + validPasswordCount);
        return validPasswordCount;
    }
}