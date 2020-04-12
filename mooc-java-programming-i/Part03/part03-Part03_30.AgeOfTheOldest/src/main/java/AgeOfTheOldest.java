
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        int oldestValue = 0;
        Scanner scanner = new Scanner(System.in);
        while (true){
            String input = scanner.nextLine();
            if (input.isEmpty()){
                System.out.println("Age of the oldest: " + oldestValue);
                
                break;
            }
            String[] splits = input.split(",");
            if (oldestValue > Integer.valueOf(splits[1])){
                oldestValue = oldestValue;
            }else if(oldestValue<Integer.valueOf(splits[1])){
                oldestValue = Integer.valueOf(splits[1]);
            }
            
        }


    }
}
