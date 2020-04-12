
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        int sum =0;
        Scanner scanner = new Scanner(System.in);
        // create a list that user can input and close by entering -1.
        ArrayList<Integer> list = new ArrayList<>();
        while (true){        
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1){
                break;
            }
            list.add(input);
        }
        // a for-each loop to find the sum
        for (Integer value:list){
            sum+=value;
        }
        int total = list.size();
        double average = 1.0* sum/total;
        System.out.println(average);
        
        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
    }
}
