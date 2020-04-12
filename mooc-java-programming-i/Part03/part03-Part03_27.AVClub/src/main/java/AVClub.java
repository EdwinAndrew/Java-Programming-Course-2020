
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            String strPrompt = scanner.nextLine();
            String[] strSplit= strPrompt.split(" ");
            if (strPrompt.isEmpty()){
                break;
            }
            for (int i = 0; i < strSplit.length ; i++) {
                if (strSplit[i].contains("av")){
                    System.out.println(strSplit[i]);
                }
            }
        }


    }
}
