
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numberofnumbers = 0;
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number != 0) {
                sum = sum + number;
                numberofnumbers = numberofnumbers + 1;
            } else {
                System.out.println("Average of the numbers: " + (sum /  numberofnumbers));
                break;
            }
        }

    }
}
