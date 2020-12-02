package placeholder.placeholder;

import java.io.FileNotFoundException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws FileNotFoundException {
        System.out.println( "Hello World!" );
        InputParser inputParser = new InputParser();
        inputParser.makeInputIntoArray();
        ValidPasswordCounter validPasswordCounter = new ValidPasswordCounter();
        validPasswordCounter.countValidPasswords();
    }
}
