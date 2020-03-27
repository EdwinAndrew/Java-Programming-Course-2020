
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
       
        while (true){
            System.out.print("Name: ");
            String inputStr = scanner.nextLine();
            if(inputStr.isEmpty()){
                break;
            }
            items.add(new Item(inputStr));
            
        }
        
        // the class Item we are printing out the items that were stored in list.
        for (Item item:items){
            System.out.println(item);
        }
        

    }
}
