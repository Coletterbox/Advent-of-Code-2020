package placeholder.placeholder;

import java.io.IOException;
import java.util.ArrayList;

public class App {
    public static void main( String[] args ) throws IOException {
        InputConverter inputConverter = new InputConverter();
        ArrayList<String> inputAsArrayList = inputConverter.convertInput("src/resources/input");
        ArrayList<String> passportArrayList = inputConverter.splitBetweenPassports(inputAsArrayList);
        PassportChecker passportChecker = new PassportChecker();
        int validPassportCount = passportChecker.countValidPassports(passportArrayList);
        System.out.println("Puzzle 1:");
        System.out.println(validPassportCount);

        int validPassportCount2 = passportChecker.countPassportsWithValidData(passportArrayList);
        System.out.println("Puzzle 2:");
        System.out.println(validPassportCount2);
    }
}
