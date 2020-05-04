
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Input numbers, type 'end' to stop");
        
        while (true){
            String input = scanner.nextLine();
            if (input.equals("end")){
                break;
            }
            list.add(input);
        }
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String selection = scanner.nextLine();
        
        if (selection.equals("n")){
            double average = list.stream()
                    .mapToInt(value -> Integer.valueOf(value))
                    .filter(value -> (value < 0))
                    .average()
                    .getAsDouble();
            System.out.println("Average of the negative numbers: " + average);
        }
        
        if (selection.equals("p")){
            double average = list.stream()
                    .mapToInt(value -> Integer.valueOf(value))
                    .filter(value -> (value > 0))
                    .average()
                    .getAsDouble();
            System.out.println("Average of the positive numbers: " + average);
        }
        

    }
}
