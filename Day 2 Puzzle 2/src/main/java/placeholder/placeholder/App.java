package placeholder.placeholder;

import java.io.FileNotFoundException;

public class App
{
    public static void main( String[] args ) throws FileNotFoundException {

        // both PasswordChecker and ValidPasswordCounter check and count passwords, so the naming is kind of off
        PasswordChecker passwordChecker = new PasswordChecker();
        passwordChecker.checkPasswords();
        // returns 1 for testInput and 263 for input
    }
}
