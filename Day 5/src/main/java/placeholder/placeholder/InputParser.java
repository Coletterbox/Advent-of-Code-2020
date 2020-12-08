package placeholder.placeholder;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class InputParser {

    public ArrayList<String> convertInputToArray(String filepath) throws IOException {
        ArrayList<String> inputAsArray = new ArrayList<String>();
        BufferedReader reader;
        reader = new BufferedReader(new FileReader(filepath));
        String line = reader.readLine();
        while (line != null) {
            System.out.println(line);
            inputAsArray.add(line);
            line = reader.readLine();
        }
        reader.close();
        return inputAsArray;
    }

    // remember that convertInputToArray will return a string array, but the next functions deal with the individual strings
    public int findRowNumber(String boardingPassSequence) {
        String rowIdentifier = boardingPassSequence.substring(0, 7);
        int numberOfRows = 127;
        int[] rangeOfRows = {0, numberOfRows};
        for (int i = 0; i < rowIdentifier.length(); i++) {
            if (rowIdentifier.charAt(i) == 'F') {
                //difference minus one
                //half
                //add to first number
                //(is second number)
                rangeOfRows[1] = rangeOfRows[0] + (rangeOfRows[1] - rangeOfRows[0] - 1)/2;
                System.out.println(Arrays.toString(rangeOfRows));
            }
            if (rowIdentifier.charAt(i) == 'B') {
                //difference minus one
                //half
                //add to first number
                //add one
                //(is first number)
                rangeOfRows[0] = rangeOfRows[0] + (rangeOfRows[1] - rangeOfRows[0] - 1)/2 + 1;
                System.out.println(Arrays.toString(rangeOfRows));
            }
        }
        //both items should be the same
        return rangeOfRows[0];
    }

    public int findColumnNumber(String boardingPassSequence) {

        return 0;
    }

    public int findSeatID(int rowNumber, int columnNumber) {

        return 0;
    }
}
