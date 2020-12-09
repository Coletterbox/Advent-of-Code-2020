package placeholder.placeholder;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.io.IOException;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void test() throws IOException {
        InputParser inputParser = new InputParser();
        inputParser.convertInput("src/resources/exampleInput");
    }

    @Test
    public void test2() throws IOException {
        InputParser inputParser = new InputParser();
        inputParser.splitInputIntoGroups("src/resources/exampleInput");
    }

    @Test
    public void test3() throws IOException {
        InputParser inputParser = new InputParser();
        inputParser.splitInputIntoGroups("src/resources/testInput");
    }

    @Test
    public void test4() throws IOException {
        InputParser inputParser = new InputParser();
        inputParser.formatAnswers("src/resources/testInput");
    }
}
