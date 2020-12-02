package placeholder.placeholder;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class InputParser {

    public static ArrayList makeInputIntoArray() throws FileNotFoundException {
//        Scanner scanner = new Scanner(new File("src/resources/input"));
        Scanner scanner = new Scanner(new File("src/resources/testInput"));
        ArrayList<String> inputArray = new ArrayList<String>();
        while (scanner.hasNext()) {
            inputArray.add(scanner.next());
        }
        scanner.close();
        System.out.println(inputArray);
        return inputArray;
    }
}
