package placeholder.placeholder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.io.IOException;

public class AppTest {
//    @Test
//    public void treeCounterReturnsInt() {
//        TreeCounter treeCounter = new TreeCounter();
//        int treeCount = treeCounter.CountTrees(3, 1);
//    }

    @Test
    public void checkConvertInputToArray() throws IOException {
        InputConverter inputConverter = new InputConverter();
        inputConverter.convertInputToArray("src/resources/input");
    }

//    @Test
//    public void checkArray() throws IOException {
//        TreeCounter treeCounter = new TreeCounter();
//        treeCounter.CountTrees("src/resources/testInput",3, 1);
//    }

    @Test
    public void checkTreeCounterForInputThatDoesNotNeedToTile() throws IOException {
        TreeCounter treeCounter = new TreeCounter();
        int treeCount = treeCounter.CountTrees("src/resources/testInput",3, 1);
        assertEquals(2, treeCount);
    }

    @Test
    public void checkTreeCounter0() throws IOException {
        TreeCounter treeCounter = new TreeCounter();
        int treeCount = treeCounter.CountTrees("src/resources/input",3, 1);
        assertEquals(156, treeCount);
    }
}
