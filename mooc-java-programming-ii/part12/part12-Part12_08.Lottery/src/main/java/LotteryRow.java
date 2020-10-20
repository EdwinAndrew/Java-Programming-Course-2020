
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {

        return this.numbers;
    }

    public void randomizeNumbers() {
        Random random = new Random();
        this.numbers = new ArrayList<>();
        while (numbers.size() < 7){
            int num = random.nextInt(40) + 1;
            if (!containsNumber(num)){
                numbers.add(num);
            }
        }
    }

    public boolean containsNumber(int number) {
        return numbers.contains(number);
    }
}

