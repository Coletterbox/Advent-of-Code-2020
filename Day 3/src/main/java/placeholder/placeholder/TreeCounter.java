package placeholder.placeholder;

import java.io.IOException;
import java.util.ArrayList;

public class TreeCounter {
    public int CountTrees(String filepath, int x, int y) throws IOException {
        // x or y must be 1 otherwise it doesn't really make sense; I should get the code to handle this
        // for this task, x will be 3 and y will be 1
        int treeCount = 0;

        InputConverter inputConverter = new InputConverter();
        ArrayList<String> inputAsArray = inputConverter.convertInputToArray(filepath);
        System.out.println(inputAsArray);

        // travel until bottom of the map; map tiles horizontally
        // i.e. if you hit the end of a string, you appear at the beginning of the string

        // starting co-ordinate is 0,0; this is top left
        int startX = 0;
        for (int startY = 0; startY < inputAsArray.size(); startY+=y) {
//            for (int startX = 0; startX < inputAsArray.get(0).length(); startX+=x) {
//
//            }
            // count trees
            String currentRow = inputAsArray.get(startY);
            char currentPosition = currentRow.charAt(startX);
            if (currentPosition == '#') {
                treeCount++;
            }
            startX+=x;
            int width = inputAsArray.get(0).length();
            if (startX >= width) {
                startX-=width;
            }
        }

        System.out.println("Tree count:");
        System.out.println(treeCount);
        return treeCount;
    }
}
