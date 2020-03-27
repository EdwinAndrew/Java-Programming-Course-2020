
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            String strIn = scanner.nextLine();
            String[] strInSplit = strIn.split(" ");
            System.out.println(strInSplit[strInSplit.length -1]);
            if (strIn.isEmpty()){
                break;
            }
        }


    }
}
