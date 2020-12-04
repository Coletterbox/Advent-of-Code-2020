package placeholder.placeholder;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

public class AppTest {
    @Test
    public void checkArrayList() throws IOException {
         InputConverter inputConverter = new InputConverter();
         inputConverter.convertInput("src/resources/exampleInput");
    }

    @Test
    public void checkArrayList2() throws IOException {
        InputConverter inputConverter = new InputConverter();
        inputConverter.convertInput("src/resources/input");
    }

    @Test
    public void checkSplitBetweenPassports() throws IOException {
        InputConverter inputConverter = new InputConverter();
        ArrayList<String> inputAsArrayList = inputConverter.convertInput("src/resources/input");
        inputConverter.splitBetweenPassports(inputAsArrayList);
    }

    @Test
    public void checkSplitBetweenPassportsExample() throws IOException {
        InputConverter inputConverter = new InputConverter();
        ArrayList<String> inputAsArrayList = inputConverter.convertInput("src/resources/exampleInput");
        System.out.println("Split between passports:");
        System.out.println(inputConverter.splitBetweenPassports(inputAsArrayList));
    }
}
