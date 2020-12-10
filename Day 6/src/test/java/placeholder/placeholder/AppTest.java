package placeholder.placeholder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

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
    // for puzzle 1 answer
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

    @Test
    public void test10() throws IOException {
        InputParser inputParser = new InputParser();
        ArrayList<String> sumCounts = inputParser.findAnswersInCommonPerGroup("src/resources/testInput2");
        System.out.println("Test: " + sumCounts);
//        assertEquals(947, sumCounts);
    }

    @Test
    public void test11() throws IOException {
        InputParser inputParser = new InputParser();
        ArrayList<String> sumCounts = inputParser.makeReadableAnswersInCommon("src/resources/testInput2");
//        System.out.println("Test: " + sumCounts);
//        assertEquals(947, sumCounts);
    }

    @Test
    public void test12() throws IOException {
        AnswerFinder answerFinder = new AnswerFinder();
        ArrayList<String> sumCounts = answerFinder.findAnswersInCommonPerGroup("src/resources/testInput2");
//        assertEquals(947, sumCounts);
    }

    @Test
    public void testSumCounts() throws IOException {
        AnswerFinder answerFinder = new AnswerFinder();
        int sum = answerFinder.sumCounts("src/resources/exampleInput");
        assertEquals(6, sum);
    }

    @Test
    // for puzzle 2 answer
    public void testSumCounts2() throws IOException {
        AnswerFinder answerFinder = new AnswerFinder();
        int sum = answerFinder.sumCounts("src/resources/input");
        assertEquals(3050, sum);
    }
}
