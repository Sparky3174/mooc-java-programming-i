
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number?");
        int userin = Integer.valueOf(scanner.nextLine());
        int last = 0;
        int sum = 0;
        int num = 0;
        int count = 0;
        while (count != userin) {
            num++;
            sum = num + last;
            last = sum;
            count++;
        }
        System.out.println("The sum is: " + sum);
    }

}
