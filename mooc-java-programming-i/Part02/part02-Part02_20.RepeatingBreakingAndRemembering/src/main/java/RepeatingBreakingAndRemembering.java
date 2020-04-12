
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int sum = 0;
        int counter = 0;
        int even = 0;
        int odd = 0;
        while (true) {
            int value = Integer.valueOf(scanner.nextLine());
            if (value == -1){
                System.out.println("Thx!Bye!");
                break;
            }else if (value % 2 == 0){
                even +=1;
            }else if (value % 2 != 0){
                odd +=1;
            }
                
            sum += value;
            counter +=1;
        }
        double average = (double)sum/counter;
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + counter );
        System.out.println("Average: " + average );
        System.out.println("Even: " + even );
        System.out.println("Odd: " + odd );
    }
}
