import java.util.Arrays;
public class MainProgram {

    public static int smallest(int[] array) {
        int lowNum = array[0];
        for (int num : array) {
            if (lowNum > num) {
                lowNum = num;
            }
        }
        return lowNum;
    }

    public static int indexOfSmallest(int[] array) {
        int index = 0;
        int lowNum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (lowNum > array[i]) {
                lowNum = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int index = 0;
        int lowNum = array[startIndex];
        for (int i = startIndex; i < array.length; i++) {
            if (lowNum > array[i]) {
                lowNum = array[i];
                index = i;
            }
            if (index == 0) {
                index = startIndex;
            }
        }
        return index;

    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = 0;
        temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

    }

    public static void sort(int[] array) {
        
        for (int i = 0; i < array.length; i++) {
            int indexOfSmallest = indexOfSmallestFrom(array,i);
            swap(array,i,indexOfSmallest);
            System.out.println(Arrays.toString(array));
            
        }
    }

    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

}
