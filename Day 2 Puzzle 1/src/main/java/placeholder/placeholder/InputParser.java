package placeholder.placeholder;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class InputParser {

    public static void makeInputIntoArray() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("src/resources/input"));
        ArrayList<String> inputArray = new ArrayList<String>();
        while (scanner.hasNext()) {
            inputArray.add(scanner.next());
        }
        System.out.println(inputArray);
        scanner.close();
    }
}
