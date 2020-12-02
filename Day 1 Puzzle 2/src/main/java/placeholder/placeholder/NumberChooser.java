package placeholder.placeholder;

public class NumberChooser {

    public static void main(String[] args) {

    }

    public static int[] chooseNumbers(int[] inputArray) {

        int[] resultArray = {0, 0, 0};

        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray.length; j++) {
                for (int k = 0; k < inputArray.length; k++) {
                    if (i != j && j != k) {
                        if (inputArray[i] + inputArray[j] + inputArray[k] == 2020) {
                            resultArray[0] = inputArray[i];
                            resultArray[1] = inputArray[j];
                            resultArray[2] = inputArray[k];
                        }
                    }
                }
            }
        }

        return resultArray;
    }
}
