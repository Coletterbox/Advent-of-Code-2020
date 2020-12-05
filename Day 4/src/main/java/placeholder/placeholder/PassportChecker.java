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
        for (int i = 0; i < passportArrayList.size(); i++) {
            // this if statement is from not stripping out blank entries
            if (passportArrayList.get(i).length() > 0) {
                String currentPassport = passportArrayList.get(i);
                if (currentPassport.contains("byr") && currentPassport.contains("iyr") && currentPassport.contains("eyr") && currentPassport.contains("hgt") && currentPassport.contains("hcl") && currentPassport.contains("ecl") && currentPassport.contains("pid")) {
                    // check credentials
                    String[] currentPassportCredentials = currentPassport.split(" ");
                    for (String field : currentPassportCredentials) {
                        String[] fieldArray = field.split(":");
                        boolean isValid = true;
                        // FIX: these don't need to be nested
//                        if (fieldArray[0] == "byr") {
//                            if (Integer.parseInt(fieldArray[1]) < 1920 || Integer.parseInt(fieldArray[1]) > 2002) {
//                                isValid = false;
//                            }
//                        }
                        if (fieldArray[0] == "byr") {
                            checkBirthYear(fieldArray);
                        }
                        if (fieldArray[0] == "iyr") {
                            if (Integer.parseInt(fieldArray[1]) < 2010 || Integer.parseInt(fieldArray[1]) > 2020) {
                                isValid = false;
                            }
                        }
                        if (fieldArray[0] == "iyr") {
                            if (Integer.parseInt(fieldArray[1]) < 2020 || Integer.parseInt(fieldArray[1]) > 2030) {
                                isValid = false;
                            }
                        }
                        if (fieldArray[0] == "hgt") {
//                            String units = fieldArray[1].charAt(fieldArray[1].length()-1) + fieldArray[1].charAt(fieldArray[1].length()-2);
                            int indexOfLastCharacter = fieldArray[1].length()-1;
                            int indexOfSecondLastCharacter = fieldArray[1].length()-2;
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append(fieldArray[1].charAt(indexOfSecondLastCharacter));
                            stringBuilder.append(fieldArray[1].charAt(indexOfLastCharacter));
                            String units = stringBuilder.toString();
                        }

                        if (isValid == true) {
                            validPassportCount++;
                        }
                    }
                    System.out.println("currentPassportCredentials: " + Arrays.toString(currentPassportCredentials));
                }
            }
        }
        return validPassportCount;
    }

    public boolean checkBirthYear(String[] fieldArray) {
        if (Integer.parseInt(fieldArray[1]) < 1920 || Integer.parseInt(fieldArray[1]) > 2002) {
            return false;
        }
        return true;
    }

    public boolean checkIssueYear(String[] fieldArray) {
        if (Integer.parseInt(fieldArray[1]) < 2010 || Integer.parseInt(fieldArray[1]) > 2020) {
            return false;
        }
        return true;
    }
}
