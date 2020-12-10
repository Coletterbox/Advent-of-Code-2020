package placeholder.placeholder;

import java.io.IOException;

public class App {
    public static void main( String[] args ) throws IOException {

        // the class names are not logical
        // "InputParser" really means "the first giant chunk"
        // "AnswerFinder" really means "the crap I rewrote"

        // puzzle 1
        InputParser inputParser = new InputParser();
        int sumCounts = inputParser.sumCounts("src/resources/input");
        // returns 6416

        // puzzle 2
        AnswerFinder answerFinder = new AnswerFinder();
        int sum = answerFinder.sumCounts("src/resources/input");
        // returns 3050
    }
}
