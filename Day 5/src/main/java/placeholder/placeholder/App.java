package placeholder.placeholder;


import java.io.IOException;

public class App {
    public static void main( String[] args ) throws IOException {
        InputParser inputParser = new InputParser();
        int highestSeatID = inputParser.findHighestSeatID("src/resources/input");
        // returns 861 :)
    }
}
