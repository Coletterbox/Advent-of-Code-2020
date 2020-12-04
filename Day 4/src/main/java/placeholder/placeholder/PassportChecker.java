package placeholder.placeholder;

import java.util.ArrayList;

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
}
