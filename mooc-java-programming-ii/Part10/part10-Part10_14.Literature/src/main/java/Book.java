
public class Book {

    private String bookName;
    private int ageRec;

    public Book(String bookName, int ageRec) {
        this.bookName = bookName;
        this.ageRec = ageRec;
    }

    public String getName() {
        return this.bookName;
    }

    public int getAgeRec() {
        return this.ageRec;
    }

    public String toString() {
        return this.getName() + " (recommended for " + this.getAgeRec() + " year-olds or older)";
    }

}
