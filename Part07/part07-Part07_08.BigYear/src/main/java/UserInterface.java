import java.util.Scanner;
import java.util.ArrayList;
public class UserInterface {
    private Scanner scan;
    private BirdRegister registry;
    public UserInterface(Scanner scan){
        this.scan = scan;
        this.registry = new BirdRegister();
    }
    public void start(){
        while (true){
            System.out.print("?");
            String input = scan.nextLine();
            
            //Add bird
            if (input.equals("Add")){
                System.out.print("Name:");
                String engName = scan.nextLine();
                System.out.print("Name in Latin: ");
                String latName = scan.nextLine();
                registry.addName(engName, latName);
                
            }
            // Quits program
            if (input.equals("Quit")){
                break;
            }
           //Observation - adds an observation 
           if(input.equals("Observation")){
               int count = 0;
               System.out.print("Bird? ");
               String searchBird = scan.nextLine();
               for (Bird bird:registry.printBirdRegister()){
                   if(bird.getName().equals(searchBird) ){
                       bird.observation();
                       count++;
                   }else if (count == 0){
                       System.out.println("Not a Bird!");
                   }
               }
           }
           //All prints all birds 
           if (input.equals("All")){
               for(Bird bird:registry.printBirdRegister()){
                   System.out.println(bird);
               }
           }
           
           //One - prints one bird
           if (input.equals("One")){
               System.out.println("Bird?");
               String oneBird = scan.nextLine();
               for(Bird bird:registry.printBirdRegister()){
                   if(bird.getName().equals(oneBird)){
                       System.out.println(bird);
                   }
               }
           }
           
        }
    }
    
}
