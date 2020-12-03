package placeholder.placeholder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.io.IOException;

public class AppTest {

    @Test
    @DisplayName("Test for small input that does not need to tile.")
    public void checkTreeCounterForInputThatDoesNotNeedToTile() throws IOException {
        TreeCounter treeCounter = new TreeCounter();
        int treeCount = treeCounter.CountTrees("src/resources/testInput",3, 1);
        assertEquals(2, treeCount);
    }

    @Test
    @DisplayName("Test for required puzzle input.")
    public void checkTreeCounter0() throws IOException {
        TreeCounter treeCounter = new TreeCounter();
        int treeCount = treeCounter.CountTrees("src/resources/input",3, 1);
        assertEquals(156, treeCount);
    }
}
