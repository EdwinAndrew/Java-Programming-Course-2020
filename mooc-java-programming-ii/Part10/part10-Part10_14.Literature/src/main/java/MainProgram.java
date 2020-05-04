import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        while (true){
            System.out.println("Input the name of the book, empty stops: ");
            String bookName = scanner.nextLine();
            if (bookName.isEmpty()){
                break;
            }
            System.out.println("Input the age recommendation: ");
            int age = Integer.valueOf(scanner.nextLine());
            books.add(new Book(bookName,age));
        }
        
        System.out.println(books.size() + " books in total.");
        System.out.println("Books:");
        
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAgeRec)
                .thenComparing(Book::getName);
        Collections.sort(books,comparator);
        
        for(Book b:books){
            System.out.println(b);
        }
    }

}

