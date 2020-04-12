
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 9999){
                break;
            }
            list.add(number);
        }
        // check for smallest number in list
        int smallNum = list.get(0);
        for (int i = 0; i < list.size(); i++){
            int nextNum = list.get(i);
            if (smallNum < nextNum){
                smallNum = smallNum;
            }else if(smallNum > nextNum){
                smallNum = nextNum;
            }
            
        }
        System.out.println("Smallest number: " + smallNum);
        // check for smallest value locations
        for (int i = 0; i < list.size(); i++){
            if (smallNum == list.get(i)){
                System.out.println("Found at index: " + i);
            }
        }
        
        

        
    }
}
