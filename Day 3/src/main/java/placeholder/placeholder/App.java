package placeholder.placeholder;

import java.io.IOException;

public class App
{
    public static void main( String[] args ) throws IOException {
        // Puzzle 1
        System.out.println( "Counting trees..." );
        TreeCounter treeCounter = new TreeCounter();
        int firstTotal = treeCounter.CountTrees("src/resources/input",3, 1);
        // some redundancy I could clean up
        System.out.println(firstTotal);

        // Puzzle 2
        long treeCount0 = treeCounter.CountTrees("src/resources/input", 1, 1);
        long treeCount1 = treeCounter.CountTrees("src/resources/input", 3, 1);
        long treeCount2 = treeCounter.CountTrees("src/resources/input", 5, 1);
        long treeCount3 = treeCounter.CountTrees("src/resources/input", 7, 1);
        long treeCount4 = treeCounter.CountTrees("src/resources/input", 1, 2);
        System.out.println("Multiplying totals...");
        long total = treeCount0*treeCount1*treeCount2*treeCount3*treeCount4;
        // 3,521,829,480
        System.out.println(total);
    }
}
