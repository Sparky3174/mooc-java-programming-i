
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int numofnum = 0;
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if (num > 0) {
                sum = sum + num;
                numofnum = numofnum + 1;
            } else if (num < 0) {
                sum = sum + 0;
            } else if (sum == 0) {
                System.out.println("Cannot calculate the average");
                break;
            } else {
                System.out.println(sum / numofnum);
                break;
            }
        }

    }
}
