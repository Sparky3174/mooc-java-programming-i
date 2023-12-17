
import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;
        search(array);
    }

    public static void search(int[] arrayTwo) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Search for? ");
        int i = 0;
        int userin = Integer.valueOf(scanner.nextLine());
        boolean found = false;
        while (i < arrayTwo.length) {
            for (int num : arrayTwo) {
                if (userin == num) {
                    found = true;
                    System.out.println(userin + " is at index " + i + ".");
                }
                i++;
            }
            if (found == false) {
                System.out.println(userin + " was not found.");
            }
        }
    }
}
