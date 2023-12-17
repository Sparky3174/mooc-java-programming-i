
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");
        int userin = Integer.valueOf(scanner.nextLine());
        int product = 1;
        int count = 1;
        while (count != userin) {
            count++;
            product = product * count;
        }
        System.out.println("Factorial: " + product);

        /* System.out.println("Give a number:");
        int userin = Integer.valueOf(scanner.nextLine());
        int product = 1;
        for (int count = 1; count != userin; count++) {
            product = product * count;
        }
        int answer = product * userin;
        System.out.println("Factorial: " + answer);*/
    }

}
