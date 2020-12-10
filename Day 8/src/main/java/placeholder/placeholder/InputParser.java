package placeholder.placeholder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class InputParser {
    ArrayList<String> convertInput(String filename) throws IOException {
        ArrayList<String> inputAsArrayList = new ArrayList<String>();
        BufferedReader reader;
        reader = new BufferedReader(new FileReader(filename));
        String line = reader.readLine();
        while (line != null) {
//            System.out.println(line);
            inputAsArrayList.add(line);
            line = reader.readLine();
        }
        reader.close();
//        System.out.println(inputAsArrayList);
        return inputAsArrayList;
    }
}
