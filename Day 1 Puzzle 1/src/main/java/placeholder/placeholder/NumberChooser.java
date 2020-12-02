package placeholder.placeholder;

public class NumberChooser {

    public static void main(String[] args) {

    }

    public static int[] chooseNumbers(int[] inputArray) {

        int[] resultArray = {0, 0};

        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray.length; j++) {
                if (i != j) {
                    if (inputArray[i] + inputArray[j] == 2020) {
                        resultArray[0] = inputArray[i];
                        resultArray[1] = inputArray[j];
                    }
                }
            }
        }

        return resultArray;
    }
}
