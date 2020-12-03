package placeholder.placeholder;

import java.io.FileNotFoundException;

public class App 
{
    public static void main( String[] args ) throws FileNotFoundException {
        ValidPasswordCounter validPasswordCounter = new ValidPasswordCounter();
        validPasswordCounter.countValidPasswords("src/resources/input");
        // returns 2 for testInput and 622 for input
    }
}
