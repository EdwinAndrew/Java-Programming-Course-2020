
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true){
           String wordIn = scanner.nextLine(); 
           String[] wordModified = wordIn.split(" ");
            System.out.println(wordModified[0]);
            if (wordIn.isEmpty()){
                break;
            }
        }

    }
}
