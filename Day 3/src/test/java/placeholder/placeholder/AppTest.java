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

    @Test
    @DisplayName("Test for other values of x and y.")
    public void checkTreeCounter1() throws IOException {
        TreeCounter treeCounter = new TreeCounter();
        int treeCount = treeCounter.CountTrees("src/resources/testInput",1, 8);
        assertEquals(0, treeCount);
    }

    // Tests specifically for part 2

    @Test
    @DisplayName("Test for right 1, down 1 using example input.")
    public void checkRight1Down1Example() throws IOException {
        TreeCounter treeCounter = new TreeCounter();
        int treeCount = treeCounter.CountTrees("src/resources/exampleInput",1, 1);
        assertEquals(2, treeCount);
    }

    @Test
    @DisplayName("Test for right 3, down 1 using example input.")
    public void checkRight3Down1Example() throws IOException {
        TreeCounter treeCounter = new TreeCounter();
        int treeCount = treeCounter.CountTrees("src/resources/exampleInput",3, 1);
        assertEquals(7, treeCount);
    }

    @Test
    @DisplayName("Test for right 5, down 1 using example input.")
    public void checkRight5Down1Example() throws IOException {
        TreeCounter treeCounter = new TreeCounter();
        int treeCount = treeCounter.CountTrees("src/resources/exampleInput",5, 1);
        assertEquals(3, treeCount);
    }

    @Test
    @DisplayName("Test for right 7, down 1 using example input.")
    public void checkRight7Down1Example() throws IOException {
        TreeCounter treeCounter = new TreeCounter();
        int treeCount = treeCounter.CountTrees("src/resources/exampleInput",7, 1);
        assertEquals(4, treeCount);
    }

    @Test
    @DisplayName("Test for right 1, down 2 using example input.")
    public void checkRight1Down2Example() throws IOException {
        TreeCounter treeCounter = new TreeCounter();
        int treeCount = treeCounter.CountTrees("src/resources/exampleInput",1, 2);
        assertEquals(2, treeCount);
    }

    @Test
    @DisplayName("Test for right 1, down 1.")
    public void checkRight1Down1() throws IOException {
        TreeCounter treeCounter = new TreeCounter();
        int treeCount = treeCounter.CountTrees("src/resources/input",1, 1);
        assertEquals(79, treeCount);
    }

    @Test
    @DisplayName("Test for right 3, down 1.")
    public void checkRight3Down1() throws IOException {
        TreeCounter treeCounter = new TreeCounter();
        int treeCount = treeCounter.CountTrees("src/resources/input",3, 1);
        assertEquals(156, treeCount);
    }

    @Test
    @DisplayName("Test for right 5, down 1.")
    public void checkRight5Down1() throws IOException {
        TreeCounter treeCounter = new TreeCounter();
        int treeCount = treeCounter.CountTrees("src/resources/input",5, 1);
        assertEquals(85, treeCount);
    }

    @Test
    @DisplayName("Test for right 7, down 1.")
    public void checkRight7Down1() throws IOException {
        TreeCounter treeCounter = new TreeCounter();
        int treeCount = treeCounter.CountTrees("src/resources/input",7, 1);
        assertEquals(82, treeCount);
    }

    @Test
    @DisplayName("Test for right 1, down 2.")
    public void checkRight1Down2() throws IOException {
        TreeCounter treeCounter = new TreeCounter();
        int treeCount = treeCounter.CountTrees("src/resources/input",1, 2);
        assertEquals(41, treeCount);
    }
}
