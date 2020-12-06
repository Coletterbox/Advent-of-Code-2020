package placeholder.placeholder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class InputConverter {

    ArrayList<String> convertInput(String filename) throws IOException {
        ArrayList<String> inputAsArrayList = new ArrayList<String>();
        BufferedReader reader;
        reader = new BufferedReader(new FileReader(filename));
        String line = reader.readLine();
        while (line != null) {
//            System.out.println(line);
            inputAsArrayList.add(line);
            line = reader.readLine();
        }
        reader.close();
//        System.out.println(inputAsArrayList);
        return inputAsArrayList;
    }

    ArrayList<String> splitBetweenPassports(ArrayList<String> inputAsArrayList) {
        ArrayList<String> passportArrayList = new ArrayList<String>();
        int passportArrayListIndex = 0;
        for (int i = 0; i < inputAsArrayList.size(); i++) {
            if (i == 0) {
                passportArrayList.add(inputAsArrayList.get(i));
            } else {
                if (inputAsArrayList.get(i).length() > 0 && inputAsArrayList.get(i-1).length() > 0) {
//                    passportArrayList.get(passportArrayListIndex) = passportArrayList.get(passportArrayListIndex) + " " + inputAsArrayList.get(i);
                    passportArrayList.add("");
                    passportArrayList.set(passportArrayListIndex, passportArrayList.get(passportArrayListIndex) + " " + inputAsArrayList.get(i));
                } else if (inputAsArrayList.get(i).length() > 0 && inputAsArrayList.get(i-1).length() == 0) {
                    passportArrayListIndex++;
                    passportArrayList.add("");
                    passportArrayList.set(passportArrayListIndex, inputAsArrayList.get(i));
                } else if (inputAsArrayList.get(i).length() == 0) {
                    passportArrayListIndex++;
                }
            }

//            if (inputAsArrayList.get(i).length() > 0) {
//                passportArrayList.add(inputAsArrayList.get(i));
//            }


        }
//        String inputAsOneString = inputAsArrayList.
//        System.out.println("passportArrayList:");
//        System.out.println(passportArrayList);
        return passportArrayList;
    }
}
