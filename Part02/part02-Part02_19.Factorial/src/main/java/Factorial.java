
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int factorialValue = 1;
        System.out.println("Give a number:");
        int value = Integer.valueOf(scanner.nextLine());
        for (int i = 1; i <= value; i++) {
            if (value == 0) {
                factorialValue = 1;

            }
            factorialValue = factorialValue * i;
        }
        System.out.println("Factorial: " + factorialValue);
    }
}
