
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Give a number:");
            int value = Integer.valueOf(scanner.nextLine());
            if (value < 0) {
                System.out.println("Unsuitable number");
            } else if (value != 0) {
                int square = (int) Math.pow(value, 2);
                System.out.println(square);
            } else if (value == 0) {
                break;
            }
        }
    }
}
