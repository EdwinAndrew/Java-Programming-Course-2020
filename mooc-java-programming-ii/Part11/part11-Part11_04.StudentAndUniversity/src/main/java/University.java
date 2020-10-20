import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private List<Student> student;

    public University(String name) {
        this.name = name;
        this.student = new ArrayList<>();
    }
}
