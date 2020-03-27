
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        String longestName = "";
        double sum = 0;
        int count =0;
        while (true){
            String input = scanner.nextLine(); 
            String[] inputSplit = input.split(",");
            if (input.isEmpty()){
                System.out.println("Longest name:" + longestName);
                System.out.println("Average of birth years:" + (sum/count));
                break;
            }
            String name = inputSplit[0];
            int year = Integer.valueOf(inputSplit[1]);
            sum +=year;
            count++;    
            if (name.length()> max){
                max = name.length();
                longestName = name;
            }

        }


    }
}
