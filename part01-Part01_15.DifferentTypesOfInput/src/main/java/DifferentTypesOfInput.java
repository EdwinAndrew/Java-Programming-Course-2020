
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // take string
        // take int
        // take double 
        // take boolean
        System.out.println("Give a string:");
        String strVal = scan.nextLine();
        System.out.println("Give an integer:");
        int integerValue = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double doubleValue = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean booleanValue = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string " + strVal);
        System.out.println("You gave the integer " + integerValue);
        System.out.println("You gave the double " + doubleValue);
        System.out.println("You gave the boolean " + booleanValue);
        
        
        // Write your program here

    }
}
