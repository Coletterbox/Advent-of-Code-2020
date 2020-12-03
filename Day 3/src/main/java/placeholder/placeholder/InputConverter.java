package placeholder.placeholder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class InputConverter {
    public ArrayList<String> convertInputToArray(String filepath) throws IOException {
        ArrayList<String> inputAsArray = new ArrayList<String>();
        BufferedReader reader;
        reader = new BufferedReader(new FileReader(filepath));
        String line = reader.readLine();
        while (line != null) {
            System.out.println(line);
            line = reader.readLine();
            inputAsArray.add(line);
        }
        reader.close();
        return inputAsArray;
    }
}
