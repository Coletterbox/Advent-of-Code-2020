package placeholder.placeholder;

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
}
