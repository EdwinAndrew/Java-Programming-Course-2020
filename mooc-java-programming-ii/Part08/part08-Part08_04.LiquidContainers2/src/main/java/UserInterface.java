import java.util.Scanner;
public class UserInterface {
    private Scanner reader;
    public Container container1;
    public Container container2;
    public UserInterface(Scanner reader, Container container1, Container container2){
        this.reader = reader;
        this.container1 = container1;
        this.container2 = container2;
    }
    
    public void start(){
        
        while (true){
            System.out.println("First:" + container1.toString());
            System.out.println("Second:" + container2.toString());
            String input = reader.nextLine();
            
            if (input.equals("quit")){
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int quantity = Integer.valueOf(parts[1]);
          
            if (command.equals("add")){
                container1.add(quantity);
            }
            if (command.equals("remove")){
                container2.remove(quantity);
            }
            if (command.equals("move")){
                if (quantity > container1.contains()){
                    container2.add(container1.contains());
                    container1.remove(quantity);
                }else{
                    container1.remove(quantity);
                    container2.add(quantity);
                }
            }
        }
    }
    
}
