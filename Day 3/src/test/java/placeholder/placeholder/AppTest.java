package placeholder.placeholder;

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
}
