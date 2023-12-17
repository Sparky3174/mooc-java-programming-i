
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int userin = Integer.valueOf(scanner.nextLine());
            if (userin == 9999) {
                break;
            }

            list.add(userin);
        }

        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        
        
        int smallest = list.get(0); //set smallest to first num in list
        for (int i = 0; i < list.size(); i++) { //loop until last index
            if (smallest > list.get(i)) { //if current number is larger than next num
                smallest = list.get(i); //set current to next
            }
        }
        System.out.println("Smallest number: " + smallest);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == smallest) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}
