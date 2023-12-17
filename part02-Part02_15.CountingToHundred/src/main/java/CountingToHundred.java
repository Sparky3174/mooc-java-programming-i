
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // while loop:

        /*  int userin = Integer.valueOf(scanner.nextLine());
        while (userin <= 100) {
            System.out.println(userin);
            userin++; 
        }*/
        //for loop:
        for (int userin = Integer.valueOf(scanner.nextLine()); userin <= 100; userin++) {
            System.out.println(userin);
        }

    }
}
