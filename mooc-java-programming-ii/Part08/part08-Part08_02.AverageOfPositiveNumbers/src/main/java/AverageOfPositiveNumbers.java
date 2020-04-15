
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum =0;
        while (true){
            String input = scanner.nextLine();
            int number = Integer.valueOf(input);
            if (number >0){
                sum +=number;
                counter++;
            }
            if (input.equals("0")){
                System.out.println("Cannot calculate the average");
                break;
            }
            
        }
        System.out.println(1.0 * sum / counter);
    }
}
