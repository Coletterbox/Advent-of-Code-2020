package placeholder.placeholder;

import java.io.IOException;
import java.util.ArrayList;

public class TreeCounter {
    public int CountTrees(String filepath, int x, int y) throws IOException {
        // for this task, x will be 3 and y will be 1
        int treeCount = 0;

        InputConverter inputConverter = new InputConverter();
        ArrayList<String> inputAsArray = inputConverter.convertInputToArray(filepath);

        // travel until bottom of the map; map tiles horizontally
        // i.e. if you hit the end of a string, you appear at the beginning of the string

        return treeCount;
    }
}
