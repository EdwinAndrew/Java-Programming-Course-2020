
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, String> map = new HashMap<>();
        map.add(1, "One");
        map.add(2, "Two");
        map.add(3, "Three");
        map.add(4, "Four");
        for (int i = 1; i < 5; i++) {
            System.out.println(map.get(i));
        }
        map.remove(3);
        for (int i = 1; i < 5; i++) {
            System.out.println(map.get(i));
        }

    }

}
