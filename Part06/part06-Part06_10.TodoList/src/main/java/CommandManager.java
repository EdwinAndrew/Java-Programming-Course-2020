
import java.util.Scanner;
public class CommandManager {
    private Scanner scanner;
    private TodoList list;
    
    public CommandManager(TodoList list, Scanner scanner){
        this.scanner = scanner;
        this.list = list;
    }
    public void give(String command){
        if(command.equals("add")){
            add();
        }else if (command.equals("list")){
            this.list.print();
        }else if (command.equals("remove")){
            remove();
        }
    }
    
    public void add(){
        System.out.println("To add: ");
        String task = scanner.nextLine();
        this.list.add(task);
    }
    
    public void remove(){
        System.out.println("Which one is removed?");
        int remove = Integer.valueOf(this.scanner.nextLine());
        this.list.remove(remove);
    }
}
