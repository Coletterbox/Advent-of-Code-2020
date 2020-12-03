package placeholder.placeholder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.io.FileNotFoundException;

public class AppTest 
{
    @Test
    public void testUsingInput() throws FileNotFoundException {
        ValidPasswordCounter validPasswordCounter = new ValidPasswordCounter();
        assertEquals(622, validPasswordCounter.countValidPasswords("src/resources/input"));
    }

    @Test
    public void testUsingTestInput() throws FileNotFoundException {
        ValidPasswordCounter validPasswordCounter = new ValidPasswordCounter();
        assertEquals(2, validPasswordCounter.countValidPasswords("src/resources/testInput"));
    }
}
