package placeholder.placeholder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.io.IOException;

public class AppTest 
{
    @Test
    public void checkConvertInputToArray() throws IOException {
        InputParser inputParser = new InputParser();
        inputParser.convertInputToArray("src/resources/testInput");
    }

    @Test
    public void checkFindRowNumber() throws IOException {
        InputParser inputParser = new InputParser();
        int rowNumber = inputParser.findRowNumber("FBFBBFFRLR");
        assertEquals(44, rowNumber);
    }

    @Test
    public void checkFindRowNumber2() throws IOException {
        InputParser inputParser = new InputParser();
        int rowNumber = inputParser.findRowNumber("BFFFBBFRRR");
        assertEquals(70, rowNumber);
    }

    @Test
    public void checkFindRowNumber3() throws IOException {
        InputParser inputParser = new InputParser();
        int rowNumber = inputParser.findRowNumber("FFFBBBFRRR");
        assertEquals(14, rowNumber);
    }

    @Test
    public void checkFindRowNumber4() throws IOException {
        InputParser inputParser = new InputParser();
        int rowNumber = inputParser.findRowNumber("BBFFBBFRLL");
        assertEquals(102, rowNumber);
    }

    @Test
    public void checkFindColumnNumber() throws IOException {
        InputParser inputParser = new InputParser();
        int columnNumber = inputParser.findColumnNumber("FBFBBFFRLR");
        assertEquals(5, columnNumber);
    }

    @Test
    public void checkFindColumnNumber2() throws IOException {
        InputParser inputParser = new InputParser();
        int columnNumber = inputParser.findColumnNumber("BFFFBBFRRR");
        assertEquals(7, columnNumber);
    }

    @Test
    public void checkFindColumnNumber3() throws IOException {
        InputParser inputParser = new InputParser();
        int columnNumber = inputParser.findColumnNumber("FFFBBBFRRR");
        assertEquals(7, columnNumber);
    }

    @Test
    public void checkFindColumnNumber4() throws IOException {
        InputParser inputParser = new InputParser();
        int columnNumber = inputParser.findColumnNumber("BBFFBBFRLL");
        assertEquals(4, columnNumber);
    }

    @Test
    public void checkFindSeatID() throws IOException {
        InputParser inputParser = new InputParser();
        int seatID = inputParser.findSeatID(44, 5);
        assertEquals(357, seatID);
    }

    @Test
    public void checkFindSeatID2() throws IOException {
        InputParser inputParser = new InputParser();
        int seatID = inputParser.findSeatID(70, 7);
        assertEquals(567, seatID);
    }

    @Test
    public void checkFindSeatID3() throws IOException {
        InputParser inputParser = new InputParser();
        int seatID = inputParser.findSeatID(14, 7);
        assertEquals(119, seatID);
    }

    @Test
    public void checkFindSeatID4() throws IOException {
        InputParser inputParser = new InputParser();
        int seatID = inputParser.findSeatID(102, 4);
        assertEquals(820, seatID);
    }

    @Test
    public void checkFindHighestSeatID() throws IOException {
        InputParser inputParser = new InputParser();
        int highestSeatID = inputParser.findHighestSeatID("src/resources/testInput");
        assertEquals(820, highestSeatID);
    }

    @Test
    // puzzle solution
    public void checkFindHighestSeatIDForInput() throws IOException {
        InputParser inputParser = new InputParser();
        int highestSeatID = inputParser.findHighestSeatID("src/resources/input");
        assertEquals(861, highestSeatID);
    }
}
