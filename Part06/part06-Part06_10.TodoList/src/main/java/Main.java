
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TodoList list = new TodoList();
        Scanner reader = new Scanner(System.in);
        UserInterface UI = new UserInterface(list, reader);
        UI.start();

    }
}
