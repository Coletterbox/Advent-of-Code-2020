package placeholder.placeholder;

import java.io.IOException;
import java.util.ArrayList;

public class AnswerFinder {
    // really this isn't the only function that belongs in this class, but I've primarily made it so that I have somewhere to rewrite this garbage

    ArrayList<String> findAnswersInCommonPerGroup(String filename) throws IOException {
        InputParser inputParser = new InputParser();
        ArrayList<String> groups = inputParser.splitInputIntoGroups(filename);

    }
}
