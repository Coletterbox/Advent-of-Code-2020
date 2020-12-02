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
        ValidPasswordCounter validPasswordCounter = new ValidPasswordCounter();
        validPasswordCounter.countValidPasswords();
    }
}
