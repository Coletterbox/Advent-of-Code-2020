package placeholder.placeholder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.io.FileNotFoundException;

public class AppTest 
{
    @Test
    public void shouldAnswerWithTrue() throws FileNotFoundException {
        ValidPasswordCounter validPasswordCounter = new ValidPasswordCounter();
        validPasswordCounter.countValidPasswords();
        assertEquals(622, validPasswordCounter.countValidPasswords());
    }
}
