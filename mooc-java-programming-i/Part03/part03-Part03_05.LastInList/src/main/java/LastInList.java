
import java.util.ArrayList;
import java.util.Scanner;

public class LastInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter =-1;
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            counter +=1;
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        
        System.out.println(list.get(counter-1));
    }
}
