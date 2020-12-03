package placeholder.placeholder;

import java.io.IOException;

public class App
{
    public static void main( String[] args ) throws IOException {
        System.out.println( "Counting trees..." );
        TreeCounter treeCounter = new TreeCounter();
        treeCounter.CountTrees("src/resources/input",3, 1);
    }
}
