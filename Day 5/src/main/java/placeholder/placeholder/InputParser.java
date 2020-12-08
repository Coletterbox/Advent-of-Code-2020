package placeholder.placeholder;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

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

        return 0;
    }
    public int findColumnNumber(String boardingPassSequence) {

        return 0;
    }
    public int findSeatID(int rowNumber, int columnNumber) {

        return 0;
    }
}
