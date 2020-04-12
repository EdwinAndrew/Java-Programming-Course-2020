
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    public boolean equals(Object compared){
        // if variable is in same position it is equal
        if(this == compared){
            return true;
        }
        //if they are not of the same type Book, then they are not equal.
        if (!(compared instanceof Book)){
            return false;
        }
        // make the object a Book object
        Book comparedBook = (Book) compared;
        //if the values of the object are equal then the objects are too.
        return this.name.equals(comparedBook.name) && this.publicationYear == (comparedBook.publicationYear);
    }
    
    

}
