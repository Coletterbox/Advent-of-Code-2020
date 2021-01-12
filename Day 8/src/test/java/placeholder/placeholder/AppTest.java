package placeholder.placeholder;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.io.IOException;

public class AppTest {
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue( true );
    }

    @Test
    public void testSplit() throws IOException {
        CommandFollower commandFollower = new CommandFollower();
        commandFollower.followCommands("src/resources/exampleInput");
    }
}
