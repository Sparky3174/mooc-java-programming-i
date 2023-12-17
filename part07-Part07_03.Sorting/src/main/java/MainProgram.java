
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {3, 2, 5, 4, 8};

        System.out.println(Arrays.toString(numbers));

        MainProgram.swap(numbers, 1, 0);
        System.out.println(Arrays.toString(numbers));

        MainProgram.swap(numbers, 0, 3);
        System.out.println(Arrays.toString(numbers));
        sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static int smallest(int[] array, int startIndex) {
        int smallest = array[startIndex];
        for (int i = startIndex; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int smallest(int[] array) {
        return smallest(array, 0);
    }

    public static int indexOfSmallest(int[] array, int startIndex) {
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] == smallest(array, startIndex)) {
                return i;
            }
        }
        return 999999;
    }

    public static int indexOfSmallest(int[] array) {
        return indexOfSmallest(array, 0);
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        return indexOfSmallest(array, startIndex);
    }

    public static void swap(int[] array, int indexOne, int indexTwo) {
        int valueOne = array[indexOne];
        int valueTwo = array[indexTwo];
        array[indexOne] = valueTwo;
        array[indexTwo] = valueOne;
    }
    
    public static void sort(int[] array) {
        int indexOfSmallest = indexOfSmallest(array);
        for(int i = 0; i < array.length; i++) {
            swap(array, i, indexOfSmallest(array, i));
        }
    }
}

