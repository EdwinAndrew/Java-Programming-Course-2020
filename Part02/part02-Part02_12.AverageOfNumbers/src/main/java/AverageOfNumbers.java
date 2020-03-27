
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter =0;
        int sum =0;
        while (true){
            System.out.println("Give a number:");
            int value = Integer.valueOf(scanner.nextLine());
            if (value == 0){
            
                System.out.println("Average of the numbers: " + ((double)sum/counter));
                break;
            }else if (value !=0){
                counter += 1;
                sum += value;
            }
        }
    }
}
