package placeholder.placeholder;

import static org.junit.Assert.assertEquals;
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

    @Test
    public void test5() throws IOException {
        InputParser inputParser = new InputParser();
        inputParser.removeDoubles("src/resources/testInput");
    }

    @Test
    public void test6() throws IOException {
        InputParser inputParser = new InputParser();
        long sumCounts = inputParser.sumCounts("src/resources/testInput");
        assertEquals(37, sumCounts);
    }

    @Test
    public void test7() throws IOException {
        InputParser inputParser = new InputParser();
        long sumCounts = inputParser.sumCounts("src/resources/exampleInput");
        assertEquals(11, sumCounts);
    }

    @Test
    // for puzzle answer
    public void test8() throws IOException {
        InputParser inputParser = new InputParser();
        long sumCounts = inputParser.sumCounts("src/resources/input");
        assertEquals(6416, sumCounts);
    }

    @Test
    public void test9() throws IOException {
        InputParser inputParser = new InputParser();
        long sumCounts = inputParser.sumCounts("src/resources/testInput2");
        assertEquals(947, sumCounts);
    }
}
