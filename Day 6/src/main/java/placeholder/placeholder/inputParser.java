package placeholder.placeholder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class inputParser {
    ArrayList<String> convertInput(String filename) throws IOException {
        ArrayList<String> inputAsArrayList = new ArrayList<String>();
        BufferedReader reader;
        reader = new BufferedReader(new FileReader(filename));
        String line = reader.readLine();
        while (line != null) {
            inputAsArrayList.add(line);
            line = reader.readLine();
        }
        reader.close();
        return inputAsArrayList;
    }

//    public void parseInput(String filename) throws IOException {
//        ArrayList<String> inputAsArrayList = convertInput(filename);
//        // array of questions
//        // question count
//    }
}
