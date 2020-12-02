package placeholder.placeholder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {
    int[] testInput = {1721, 979, 366, 299, 675, 1456};
    int[] testInput2 = {3, 2018, 2000, 300, 20};

    @Test
    public void chooseNumbersReturnsSomething() {
        NumberChooser numberChooser = new NumberChooser();
        assertTrue(numberChooser.chooseNumbers(testInput) != null);
    }

    @Test
    public void chosenNumbersEqual2020() {
        NumberChooser numberChooser = new NumberChooser();
        int[] resultArray = numberChooser.chooseNumbers(testInput);
        assertTrue(resultArray[0] + resultArray[1] == 2020);
    }

    @Test
    public void checkProductOfNumbers() {
        NumberChooser numberChooser = new NumberChooser();
        int[] resultArray = numberChooser.chooseNumbers(testInput);
        assertEquals(514579, NumberMultiplier.multiplyNumbers(resultArray));
    }

    @Test
    public void chosenNumbersEqual2020Again() {
        NumberChooser numberChooser = new NumberChooser();
        int[] resultArray = numberChooser.chooseNumbers(testInput2);
        assertTrue(resultArray[0] + resultArray[1] == 2020);
    }

    @Test
    public void checkProductOfNumbersAgain() {
        NumberChooser numberChooser = new NumberChooser();
        int[] resultArray = numberChooser.chooseNumbers(testInput2);
        assertEquals(40000, NumberMultiplier.multiplyNumbers(resultArray));
    }
}
