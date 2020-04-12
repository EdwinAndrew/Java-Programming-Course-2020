import java.util.Scanner;
public class UserInterface {
    public Scanner reader;
    public Container first;
    public Container second;

    
    public UserInterface(Scanner reader){
        this.reader = reader;
        this.first = new Container();
        this.second = new Container();
    }
    
    public void start(){
        while (true){
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            
            String input = reader.nextLine();
            if (input.equals("quit")){
                break;
            }
            
            String [] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            commandManager(command, amount);
            System.out.println("");
        }
    }
    
    public void commandManager(String command, int amount){

        if (command.equals("add")){
            first.add(amount);
            
        }else if (command.equals("remove")){
            second.remove(amount);
        }else if (command.equals("move")){
            if (first.volume - amount < 0){
                second.add(first.volume);
            }else{
                first.remove(amount);
                second.add(amount);
            }
        }
            
    }
    
}
