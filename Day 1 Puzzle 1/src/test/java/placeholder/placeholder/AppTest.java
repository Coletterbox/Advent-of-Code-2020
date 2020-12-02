package placeholder.placeholder;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest 
{
    int[] testInput = {1721, 979, 366, 299, 675, 1456};

    @Test
    public void chooseNumbersReturnsArray()
    {
        NumberChooser numberChooser = new NumberChooser();
        assertTrue( NumberChooser.chooseNumbers(testInput) instanceof int[]  );
    }
}
