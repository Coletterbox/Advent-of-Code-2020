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
    public void checkValidHeightInCm() throws IOException {
        PassportChecker passportChecker = new PassportChecker();
        String[] height = {"hgt", "155cm"};
        boolean isValid = passportChecker.checkHeight(height);
        assertTrue(isValid);
    }

    @Test
    public void checkMinHeightInCm() throws IOException {
        PassportChecker passportChecker = new PassportChecker();
        String[] height = {"hgt", "150cm"};
        boolean isValid = passportChecker.checkHeight(height);
        assertTrue(isValid);
    }

    @Test
    public void checkMaxHeightInCm() throws IOException {
        PassportChecker passportChecker = new PassportChecker();
        String[] height = {"hgt", "193cm"};
        boolean isValid = passportChecker.checkHeight(height);
        assertTrue(isValid);
    }

    @Test
    public void checkLowInvalidHeightInCm() throws IOException {
        PassportChecker passportChecker = new PassportChecker();
        String[] height = {"hgt", "140cm"};
        boolean isValid = passportChecker.checkHeight(height);
        assertFalse(isValid);
    }

    @Test
    public void checkHighInvalidHeightInCm() throws IOException {
        PassportChecker passportChecker = new PassportChecker();
        String[] height = {"hgt", "200cm"};
        boolean isValid = passportChecker.checkHeight(height);
        assertFalse(isValid);
    }

    @Test
    public void checkValidHeightInIn() throws IOException {
        PassportChecker passportChecker = new PassportChecker();
        String[] height = {"hgt", "61in"};
        boolean isValid = passportChecker.checkHeight(height);
        assertTrue(isValid);
    }

    @Test
    public void checkMinHeightInIn() throws IOException {
        PassportChecker passportChecker = new PassportChecker();
        String[] height = {"hgt", "59in"};
        boolean isValid = passportChecker.checkHeight(height);
        assertTrue(isValid);
    }

    @Test
    public void checkMaxHeightInIn() throws IOException {
        PassportChecker passportChecker = new PassportChecker();
        String[] height = {"hgt", "76in"};
        boolean isValid = passportChecker.checkHeight(height);
        assertTrue(isValid);
    }

    @Test
    public void checkLowInvalidHeightInIn() throws IOException {
        PassportChecker passportChecker = new PassportChecker();
        String[] height = {"hgt", "50in"};
        boolean isValid = passportChecker.checkHeight(height);
        assertFalse(isValid);
    }

    @Test
    public void checkHighInvalidHeightInIn() throws IOException {
        PassportChecker passportChecker = new PassportChecker();
        String[] height = {"hgt", "99in"};
        boolean isValid = passportChecker.checkHeight(height);
        assertFalse(isValid);
    }

    @Test
    public void checkHeightWithWrongUnits() throws IOException {
        PassportChecker passportChecker = new PassportChecker();
        String[] height = {"hgt", "155in"};
        boolean isValid = passportChecker.checkHeight(height);
        assertFalse(isValid);
    }

    @Test
    public void checkHeightWithWrongUnits2() throws IOException {
        PassportChecker passportChecker = new PassportChecker();
        String[] height = {"hgt", "60cm"};
        boolean isValid = passportChecker.checkHeight(height);
        assertFalse(isValid);
    }

    @Test
    public void checkHeightWithNoUnits() throws IOException {
        PassportChecker passportChecker = new PassportChecker();
        String[] height = {"hgt", "60"};
        boolean isValid = passportChecker.checkHeight(height);
        assertFalse(isValid);
    }

    @Test
    public void checkValidHairColour() throws IOException {
        PassportChecker passportChecker = new PassportChecker();
        String[] hairColour = {"hcl", "#123abc"};
        boolean isValid = passportChecker.checkHairColour(hairColour);
        assertTrue(isValid);
    }

    @Test
    public void checkInvalidHairColour() throws IOException {
        PassportChecker passportChecker = new PassportChecker();
        String[] hairColour = {"hcl", "#123abz"};
        boolean isValid = passportChecker.checkHairColour(hairColour);
        assertFalse(isValid);
    }

    @Test
    public void checkTooShortHairColour() throws IOException {
        PassportChecker passportChecker = new PassportChecker();
        String[] hairColour = {"hcl", "#123"};
        boolean isValid = passportChecker.checkHairColour(hairColour);
        assertFalse(isValid);
    }

    @Test
    public void checkHairColourNoHash() throws IOException {
        PassportChecker passportChecker = new PassportChecker();
        String[] hairColour = {"hcl", "145623"};
        boolean isValid = passportChecker.checkHairColour(hairColour);
        assertFalse(isValid);
    }

    @Test
    public void checkHairColourNoHashRightLength() throws IOException {
        PassportChecker passportChecker = new PassportChecker();
        String[] hairColour = {"hcl", "1456233"};
        boolean isValid = passportChecker.checkHairColour(hairColour);
        assertFalse(isValid);
    }

    @Test
    public void checkValidEyeColour() throws IOException {
        PassportChecker passportChecker = new PassportChecker();
        String[] eyeColour = {"ecl", "amb"};
        boolean isValid = passportChecker.checkEyeColour(eyeColour);
        assertTrue(isValid);
    }

    @Test
    public void checkValidEyeColour2() throws IOException {
        PassportChecker passportChecker = new PassportChecker();
        String[] eyeColour = {"ecl", "blu"};
        boolean isValid = passportChecker.checkEyeColour(eyeColour);
        assertTrue(isValid);
    }

    @Test
    public void checkValidEyeColour3() throws IOException {
        PassportChecker passportChecker = new PassportChecker();
        String[] eyeColour = {"ecl", "brn"};
        boolean isValid = passportChecker.checkEyeColour(eyeColour);
        assertTrue(isValid);
    }

    @Test
    public void checkValidEyeColour4() throws IOException {
        PassportChecker passportChecker = new PassportChecker();
        String[] eyeColour = {"ecl", "gry"};
        boolean isValid = passportChecker.checkEyeColour(eyeColour);
        assertTrue(isValid);
    }

    @Test
    public void checkValidEyeColour5() throws IOException {
        PassportChecker passportChecker = new PassportChecker();
        String[] eyeColour = {"ecl", "grn"};
        boolean isValid = passportChecker.checkEyeColour(eyeColour);
        assertTrue(isValid);
    }

    @Test
    public void checkValidEyeColour6() throws IOException {
        PassportChecker passportChecker = new PassportChecker();
        String[] eyeColour = {"ecl", "hzl"};
        boolean isValid = passportChecker.checkEyeColour(eyeColour);
        assertTrue(isValid);
    }

    @Test
    public void checkValidEyeColour7() throws IOException {
        PassportChecker passportChecker = new PassportChecker();
        String[] eyeColour = {"ecl", "oth"};
        boolean isValid = passportChecker.checkEyeColour(eyeColour);
        assertTrue(isValid);
    }

    @Test
    public void checkInvalidEyeColour() throws IOException {
        PassportChecker passportChecker = new PassportChecker();
        String[] eyeColour = {"ecl", "mmb"};
        boolean isValid = passportChecker.checkEyeColour(eyeColour);
        assertFalse(isValid);
    }

    @Test
    public void checkInvalidEyeColour2() throws IOException {
        PassportChecker passportChecker = new PassportChecker();
        String[] eyeColour = {"ecl", ""};
        boolean isValid = passportChecker.checkEyeColour(eyeColour);
        assertFalse(isValid);
    }

    @Test
    public void checkInvalidEyeColour3() throws IOException {
        PassportChecker passportChecker = new PassportChecker();
        String[] eyeColour = {"ecl", "mdjshjkfdjkfd"};
        boolean isValid = passportChecker.checkEyeColour(eyeColour);
        assertFalse(isValid);
    }

    @Test
    public void checkValidPassportID() throws IOException {
        PassportChecker passportChecker = new PassportChecker();
        String[] passportID = {"pid", "000000001"};
        boolean isValid = passportChecker.checkPassportID(passportID);
        assertTrue(isValid);
    }

    @Test
    public void checkValidPassportID2() throws IOException {
        PassportChecker passportChecker = new PassportChecker();
        String[] passportID = {"pid", "556412378"};
        boolean isValid = passportChecker.checkPassportID(passportID);
        assertTrue(isValid);
    }

    @Test
    public void checkTooLongPassportID() throws IOException {
        PassportChecker passportChecker = new PassportChecker();
        String[] passportID = {"pid", "0000000011"};
        boolean isValid = passportChecker.checkPassportID(passportID);
        assertFalse(isValid);
    }

    @Test
    public void checkTooShortPassportID() throws IOException {
        PassportChecker passportChecker = new PassportChecker();
        String[] passportID = {"pid", "0000011"};
        boolean isValid = passportChecker.checkPassportID(passportID);
        assertFalse(isValid);
    }

    @Test
    public void checkInvalidPassportID() throws IOException {
        PassportChecker passportChecker = new PassportChecker();
        String[] passportID = {"pid", "aaaaaaaaa"};
        boolean isValid = passportChecker.checkPassportID(passportID);
        assertFalse(isValid);
    }

    // please stop forgetting to change the function when you're testing a new one
}
