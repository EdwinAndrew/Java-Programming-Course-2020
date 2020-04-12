import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Books> book = new ArrayList<>();
        while (true){
            System.out.println("Title:");
            String bookName = scanner.nextLine();
            // stop input if empty
            if (bookName.isEmpty()){
                break;
            }
            System.out.println("Pages: ");
            int numPages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year: ");
            int pubYear = Integer.valueOf(scanner.nextLine());
            // add to list
            book.add(new Books(bookName,numPages,pubYear));
        }
        
        System.out.println("What information will be printed? ");
        String filter = scanner.nextLine();
        if (filter.equals("name")){
            for(Books name:book){
                System.out.println(name.getTitle());
            }
        }else if (filter.equals("year")){
            for(Books name:book){
                System.out.println(name.getPubYear());
            }
        }else if (filter.equals("pages")){
            for(Books name:book){
            System.out.println(name.getPages());
            }
        }else if (filter.equals("everything")){
            for(Books name:book){
                System.out.println(name.toString());
            }
        }
    }
}
