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
}
