package placeholder.placeholder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class CommandFollower {

    void followCommands(String filename) throws IOException {
        InputParser inputParser = new InputParser();
        ArrayList<String> commandList = inputParser.convertInput(filename);

        boolean[] commandsRun = new boolean[commandList.size()];
        Arrays.fill(commandsRun, Boolean.FALSE);

        int accumulator = 0;

        for (int i = 0; i < commandList.size(); i++) {
            String[] operationAndArgument = commandList.get(i).split(" ");
            System.out.println(Arrays.toString(operationAndArgument));

            followCommand(operationAndArgument);
        }
    }

    void followCommand(String[] operationAndArgument) {
        String operation = operationAndArgument[0];
        String argument = operationAndArgument[1];
        String sign = argument.substring(0, 1);
        String value = argument.substring(1);

        System.out.println(operation);
        System.out.println(sign);
        System.out.println(value);
    }

//    boolean[] test() throws IOException {
//        return followCommands("exampleInput").commandsRun;
//    }
}
