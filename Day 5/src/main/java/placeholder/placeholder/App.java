package placeholder.placeholder;


import java.io.IOException;

public class App {
    public static void main( String[] args ) throws IOException {
        InputParser inputParser = new InputParser();
        int highestSeatID = inputParser.findHighestSeatID("src/resources/input");
        System.out.println(highestSeatID);
        // returns 861 :)

        int seatNumber = inputParser.findGap("src/resources/input");
        System.out.println(seatNumber);
        // 633 is the gap; currently returns 634
    }
}
