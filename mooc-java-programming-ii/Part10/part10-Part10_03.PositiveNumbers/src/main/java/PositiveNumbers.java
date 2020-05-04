
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        
        for (int i = -20; i < 21; i++) {
            numbers.add(i);
        }

        System.out.println(PositiveNumbers.positive(numbers));

    }
    
    public static List<Integer> positive(List<Integer> numbers){
        List<Integer> positiveFilter = numbers.stream()
                .filter(value -> (value > 0))
                .collect(Collectors.toCollection(ArrayList::new));
        return positiveFilter;
    }

}
