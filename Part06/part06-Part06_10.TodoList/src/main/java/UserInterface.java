
import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {
    
    private Scanner reader;
    private TodoList list;
    
    public UserInterface(TodoList list, Scanner reader) {
        this.reader = reader;
        this.list = list;
    }
    
    public void start() {
        CommandManager cManager = new CommandManager(this.list, this.reader);
        while (true) {
            System.out.println("Command:");
            String commandIn = reader.nextLine();
            if (commandIn.equals("stop")) {
                break;
            }
            cManager.give(commandIn);
        }
    }
}
