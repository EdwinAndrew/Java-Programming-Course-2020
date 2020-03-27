
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while (true){
            System.out.println("Give a number:");
            int newNum = Integer.valueOf(scanner.nextLine());
            if (newNum < 0){
                counter +=1;
            }else if (newNum == 0){
                System.out.println("Number of negative numbers: " + counter);
                break;
            }
        }
    }
}
