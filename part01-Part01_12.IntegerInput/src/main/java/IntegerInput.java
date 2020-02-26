
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        String stringValue = scanner.nextLine();
        int value = Integer.valueOf(stringValue);
        System.out.println("You gave the number " + value);
        // write your program here

    }
}
