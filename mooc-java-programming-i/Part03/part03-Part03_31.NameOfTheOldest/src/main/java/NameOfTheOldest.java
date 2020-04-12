
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        int oldestValue = 0;
        String nameOldest = "";
        Scanner scanner = new Scanner(System.in);
        while (true) {

            String input = scanner.nextLine();
            String[] splits = input.split(",");

            if (input.isEmpty()) {
                System.out.println("Name of the oldest: " + nameOldest);

                break;
            }

            if (oldestValue > Integer.valueOf(splits[1])) {
                oldestValue = oldestValue;
                nameOldest = nameOldest;
            } else if (oldestValue < Integer.valueOf(splits[1])) {
                oldestValue = Integer.valueOf(splits[1]);
                nameOldest = splits[0];
            }

        }

    }
}
