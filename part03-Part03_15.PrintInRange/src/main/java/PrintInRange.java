
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(12);
        list.add(9);
        list.add(5);
        list.add(42);
        list.add(19);
        list.add(7);
        
        printNumbersInRange(list, 0, 5);
        
    }
    
    
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (int number: numbers) {
            if (number <= upperLimit && number >= lowerLimit) {
                System.out.println(number);
            }
        }
    }
}
