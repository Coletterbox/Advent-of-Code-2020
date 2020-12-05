package placeholder.placeholder;

import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void checkArrayList() throws IOException {
         InputConverter inputConverter = new InputConverter();
         inputConverter.convertInput("src/resources/exampleInput");
    }

    @Test
    public void checkArrayList2() throws IOException {
        InputConverter inputConverter = new InputConverter();
        inputConverter.convertInput("src/resources/input");
    }

    @Test
    public void checkSplitBetweenPassports() throws IOException {
        InputConverter inputConverter = new InputConverter();
        ArrayList<String> inputAsArrayList = inputConverter.convertInput("src/resources/input");
        inputConverter.splitBetweenPassports(inputAsArrayList);
    }

    @Test
    public void checkSplitBetweenPassportsExample() throws IOException {
        InputConverter inputConverter = new InputConverter();
        ArrayList<String> inputAsArrayList = inputConverter.convertInput("src/resources/exampleInput");
        System.out.println("Split between passports:");
        System.out.println(inputConverter.splitBetweenPassports(inputAsArrayList));
    }

    @Test
    public void checkValidPassportCounter() throws IOException {
        InputConverter inputConverter = new InputConverter();
        ArrayList<String> inputAsArrayList = inputConverter.convertInput("src/resources/exampleInput");
        ArrayList<String> passportArrayList = inputConverter.splitBetweenPassports(inputAsArrayList);
        PassportChecker passportChecker = new PassportChecker();
        int validPassportCount = passportChecker.countValidPassports(passportArrayList);
        assertEquals(2, validPassportCount);
    }

    @Test
    public void checkValidPassportCounter2() throws IOException {
        InputConverter inputConverter = new InputConverter();
        ArrayList<String> inputAsArrayList = inputConverter.convertInput("src/resources/input");
        ArrayList<String> passportArrayList = inputConverter.splitBetweenPassports(inputAsArrayList);
        PassportChecker passportChecker = new PassportChecker();
        int validPassportCount = passportChecker.countValidPassports(passportArrayList);
        assertEquals(202, validPassportCount);
    }

    @Test
    public void testCredentialChecker() throws IOException {
        InputConverter inputConverter = new InputConverter();
        ArrayList<String> inputAsArrayList = inputConverter.convertInput("src/resources/input");
        ArrayList<String> passportArrayList = inputConverter.splitBetweenPassports(inputAsArrayList);
        PassportChecker passportChecker = new PassportChecker();
        int validPassportCount = passportChecker.countValidPassports(passportArrayList);
        passportChecker.countPassportsWithValidData(passportArrayList);
    }

    @Test
    public void testValidBirthYear() throws IOException {
        PassportChecker passportChecker = new PassportChecker();
        String[] birthYear = {"byr", "2000"};
        boolean isValid = passportChecker.checkBirthYear(birthYear);
        assertTrue(isValid);
    }

    @Test
    public void testHighInvalidBirthYear() throws IOException {
        PassportChecker passportChecker = new PassportChecker();
        String[] birthYear = {"byr", "2007"};
        boolean isValid = passportChecker.checkBirthYear(birthYear);
        assertFalse(isValid);
    }

    @Test
    public void testLowInvalidBirthYear() throws IOException {
        PassportChecker passportChecker = new PassportChecker();
        String[] birthYear = {"byr", "1900"};
        boolean isValid = passportChecker.checkBirthYear(birthYear);
        assertFalse(isValid);
    }

    @Test
    public void testMinimumBirthYear() throws IOException {
        PassportChecker passportChecker = new PassportChecker();
        String[] birthYear = {"byr", "1920"};
        boolean isValid = passportChecker.checkBirthYear(birthYear);
        assertTrue(isValid);
    }

    @Test
    public void testMaximumBirthYear() throws IOException {
        PassportChecker passportChecker = new PassportChecker();
        String[] birthYear = {"byr", "2002"};
        boolean isValid = passportChecker.checkBirthYear(birthYear);
        assertTrue(isValid);
    }

    @Test
    public void testValidIssueYear() throws IOException {
        PassportChecker passportChecker = new PassportChecker();
        String[] issueYear = {"iyr", "2015"};
        boolean isValid = passportChecker.checkIssueYear(issueYear);
        assertTrue(isValid);
    }

    @Test
    public void testHighInvalidIssueYear() throws IOException {
        PassportChecker passportChecker = new PassportChecker();
        String[] issueYear = {"iyr", "2021"};
        boolean isValid = passportChecker.checkIssueYear(issueYear);
        assertFalse(isValid);
    }

    @Test
    public void testLowInvalidIssueYear() throws IOException {
        PassportChecker passportChecker = new PassportChecker();
        String[] issueYear = {"iyr", "1900"};
        boolean isValid = passportChecker.checkIssueYear(issueYear);
        assertFalse(isValid);
    }

    @Test
    public void testMinimumIssueYear() throws IOException {
        PassportChecker passportChecker = new PassportChecker();
        String[] issueYear = {"iyr", "2010"};
        boolean isValid = passportChecker.checkIssueYear(issueYear);
        assertTrue(isValid);
    }

    @Test
    public void testMaximumIssueYear() throws IOException {
        PassportChecker passportChecker = new PassportChecker();
        String[] issueYear = {"iyr", "2020"};
        boolean isValid = passportChecker.checkIssueYear(issueYear);
        assertTrue(isValid);
    }

    @Test
    public void testValidExpirationYear() throws IOException {
        PassportChecker passportChecker = new PassportChecker();
        String[] expirationYear = {"eyr", "2025"};
        boolean isValid = passportChecker.checkExpirationYear(expirationYear);
        assertTrue(isValid);
    }

    @Test
    public void testLowInvalidExpirationYear() throws IOException {
        PassportChecker passportChecker = new PassportChecker();
        String[] expirationYear = {"eyr", "2015"};
        boolean isValid = passportChecker.checkExpirationYear(expirationYear);
        assertFalse(isValid);
    }

    @Test
    public void checkHeightThing() throws IOException {
        PassportChecker passportChecker = new PassportChecker();
        String[] height = {"hgt", "155cm"};
        boolean isValid = passportChecker.checkHeight(height);
        assertTrue(isValid);
    }
}
