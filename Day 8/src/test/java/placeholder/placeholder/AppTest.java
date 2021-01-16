package placeholder.placeholder;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;

public class AppTest {
    private static CommandFollower commandFollower;

    @BeforeClass
    public static void setup() throws IOException {
        commandFollower = new CommandFollower();
        commandFollower.followCommands("src/resources/exampleInput");
    }

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue( true );
    }

    @Test
    public void testSplit() throws IOException {
        CommandFollower commandFollower = new CommandFollower();
        commandFollower.followCommands("src/resources/exampleInput");
    }

//    @Test
//    public void testTesting() throws IOException {
////        CommandFollower commandFollower = new CommandFollower();
////        commandFollower.followCommands("src/resources/exampleInput");
//        commandFollower.getValue("accumulator");
//    }
}
