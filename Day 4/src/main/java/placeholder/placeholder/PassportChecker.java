package placeholder.placeholder;

import java.util.ArrayList;
import java.util.Arrays;

public class PassportChecker {
    public int countValidPassports(ArrayList<String> passportArrayList) {
        int validPassportCount = 0;
        for (int i = 0; i < passportArrayList.size(); i++) {
            // this if statement is from not stripping out blank entries
            if (passportArrayList.get(i).length() > 0) {
                String currentPassport = passportArrayList.get(i);
                if (currentPassport.contains("byr") && currentPassport.contains("iyr") && currentPassport.contains("eyr") && currentPassport.contains("hgt") && currentPassport.contains("hcl") && currentPassport.contains("ecl") && currentPassport.contains("pid")) {
                    validPassportCount++;
                }
            }
        }
        return validPassportCount;
    }

    public int countPassportsWithValidData(ArrayList<String> passportArrayList) {
        int validPassportCount = 0;
        ArrayList <String> validPassports = new ArrayList<String>();
        for (int i = 0; i < passportArrayList.size(); i++) {
            // this if statement is from not stripping out blank entries
            if (passportArrayList.get(i).length() > 0) {
                String currentPassport = passportArrayList.get(i);
                if (currentPassport.contains("byr") && currentPassport.contains("iyr") && currentPassport.contains("eyr") && currentPassport.contains("hgt") && currentPassport.contains("hcl") && currentPassport.contains("ecl") && currentPassport.contains("pid")) {
                    // check credentials
                    String[] currentPassportCredentials = currentPassport.split(" ");
                    boolean passportIsValid = true;
                    for (String field : currentPassportCredentials) {
                        String[] fieldArray = field.split(":");
//                        System.out.println("fieldArray:");
//                        System.out.println(Arrays.toString(fieldArray));
                        // check each field; change passportIsValid to false if anything is invalid
                        if (fieldArray[0].equals("byr")) {
                            if (!checkBirthYear(fieldArray)) {
                                passportIsValid = false;
                            }
                        }
                        if (fieldArray[0].equals("iyr")) {
                            if (!checkIssueYear(fieldArray)) {
                                passportIsValid = false;
                            }
                        }
                        if (fieldArray[0].equals("eyr")) {
                            if (!checkExpirationYear(fieldArray)) {
                                passportIsValid = false;
                            }
                        }
                        if (fieldArray[0].equals("hgt")) {
                            if (!checkHeight(fieldArray)) {
                                passportIsValid = false;
                            }
                        }
                        if (fieldArray[0].equals("hcl")) {
                            if (!checkHairColour(fieldArray)) {
                                passportIsValid = false;
                            }
                        }
                        if (fieldArray[0].equals("ecl")) {
                            if (!checkEyeColour(fieldArray)) {
                                passportIsValid = false;
                            }
                        }
                        if (fieldArray[0].equals("pid")) {
                            if (!checkPassportID(fieldArray)) {
                                passportIsValid = false;
                            }
                        }
                    }
                    if (passportIsValid) {
                        validPassports.add(currentPassport);
                        validPassportCount++;
                    }
//                    System.out.println("currentPassportCredentials: " + Arrays.toString(currentPassportCredentials));
                }
            }
        }
        // next two comments are half written
//        public ArrayList<String> validPassportArray = validPassports;
        System.out.println("Valid passports:");
        System.out.println(validPassports);
        return validPassportCount;
    }

//    String[][] validPassportCountSplit(ArrayList<String> passportArrayList) {
//        ArrayList<String> validPassportCount = countPassportsWithValidData(passportArrayList).validPassportArray;
//
//    }

    public boolean checkBirthYear(String[] fieldArray) {
        if (fieldArray[1].length() != 4 || Integer.parseInt(fieldArray[1]) < 1920 || Integer.parseInt(fieldArray[1]) > 2002) {
            return false;
        }
        return true;
    }

    public boolean checkIssueYear(String[] fieldArray) {
        if (fieldArray[1].length() != 4 || Integer.parseInt(fieldArray[1]) < 2010 || Integer.parseInt(fieldArray[1]) > 2020) {
            return false;
        }
        return true;
    }

    public boolean checkExpirationYear(String[] fieldArray) {
        if (fieldArray[1].length() != 4 || Integer.parseInt(fieldArray[1]) < 2020 || Integer.parseInt(fieldArray[1]) > 2030) {
            return false;
        }
        return true;
    }

    public boolean checkHeight(String[] fieldArray) {
        if (fieldArray[1].length() < 3) {
            return false;
        }
        int indexOfLastCharacter = fieldArray[1].length()-1;
        int indexOfSecondLastCharacter = fieldArray[1].length()-2;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(fieldArray[1].charAt(indexOfSecondLastCharacter));
        stringBuilder.append(fieldArray[1].charAt(indexOfLastCharacter));
        String units = stringBuilder.toString();
//        System.out.println("fieldArray[1]:");
//        System.out.println(fieldArray[1]);
//        System.out.println("units:");
//        System.out.println(units);
        String numberAsString = fieldArray[1].substring(0, fieldArray[1].length()-2);
//        System.out.println("numberAsString:");
//        System.out.println(numberAsString);

//        try {

            int numberAsInt = Integer.parseInt(numberAsString);
            // un-nest these
            // TODO: check that height without units is covered
            if (!units.matches("cm") && !units.matches("in")) {
                return false;
            }
            if (units.matches("cm")) {
                if (numberAsInt < 150 || numberAsInt > 193) {
                    return false;
                }
            }
            if (units.matches("in")) {
                if (numberAsInt < 59 || numberAsInt > 76) {
                    return false;
                }
            }

//        } catch(Exception e) {
//            return false;
//        }

//        if (Integer.parseInt(fieldArray[1]) < 2020 || Integer.parseInt(fieldArray[1]) > 2030) {
//            return false;
//        }
        return true;
    }

    public boolean checkHairColour(String[] fieldArray) {
//        System.out.println("Hair colour debugging:");
//        System.out.println("fieldArray: " + fieldArray);
//        System.out.println("fieldArray[0]: " + fieldArray[0]);
//        System.out.println("fieldArray[1]: " + fieldArray[1]);
        if (fieldArray[1].length() != 7) {
            return false;
        }
        char firstCharacter = fieldArray[1].charAt(0);
        if (firstCharacter != '#') {
            return false;
        }
        for (int i = 1; i < fieldArray[1].length(); i++) {
            // TODO: if it IS a-f or 0-9? am I just tired or is that wrong?
            if (String.valueOf(fieldArray[1].charAt(i)).matches("[^a-f0-9]")) {
//            if (String.valueOf(fieldArray[1].charAt(i)).matches("[^A-Fa-f0-9]")) {
                return false;
            }

//            if (!String.valueOf(fieldArray[1].charAt(i)).matches("[^a-f0-9]")) {
//                return false;
//            }
        }
        return true;
    }

    public boolean checkEyeColour(String[] fieldArray) {
        String colour = fieldArray[1];
//        System.out.println("eye colour:");
//        System.out.println(fieldArray[1]);
        return (colour.equals("amb") || colour.equals("blu") || colour.equals("brn") || colour.equals("gry") || colour.equals("grn") || colour.equals("hzl") || colour.equals("oth"));
    }

    public boolean checkPassportID(String[] fieldArray) {
        String passportID = fieldArray[1];
        if (passportID.length() != 9) {
            return false;
        }
        for (int i = 0; i < passportID.length(); i++) {
            char currentChar = fieldArray[1].charAt(i);

//            String currentCharAsString = String.valueOf(currentChar);

            int currentCharCode = (int) currentChar;
            // TODO: double-check?
            if (currentCharCode < 48 || currentCharCode > 57) {
                return false;
            }

            // other TODO:
//            if (!String.valueOf(passportID.charAt(i)).matches("[^0-9]")) {
//                return false;
//            }

//            // yeah, I know
//            if (!(currentChar == 0 || currentChar == 1 || currentChar == 2 || currentChar == 3 || currentChar == 4 || currentChar == 5 || currentChar == 6 || currentChar == 7 || currentChar == 8 || currentChar == 9)) {
//                return false;
//            }
        }
        return true;
    }
}
