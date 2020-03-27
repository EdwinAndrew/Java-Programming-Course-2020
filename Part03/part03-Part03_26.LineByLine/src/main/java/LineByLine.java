
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String strPrompt = scanner.nextLine();
            String[] strPromptSplit = strPrompt.split(" ");
            for(String values:strPromptSplit){
                System.out.println(values);
            }
            if (strPrompt.isEmpty()){
                break;
            }
        }
        
        


    }
}
