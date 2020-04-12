
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PointManager points = new PointManager();
        UserInterface ui = new UserInterface(scanner,points);
        ui.start();
    }
}
