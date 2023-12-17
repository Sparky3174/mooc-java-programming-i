
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int last = 0;
        int sum = 0;
        int count = 0;
        int oddcount = 0;
        int evencount = 0;
        while (true) {
            int userin = Integer.valueOf(scanner.nextLine());
            if (userin % 2 == 1) {
                oddcount++;
            } else if (userin % 2 == 0)  {
                evencount++;
            }
            sum = last + userin;
            last = sum;
            count++;
            if (userin == -1) {
                count--;
                sum++;
                System.out.println("Thx! Bye!");
                System.out.println("Sum: " + sum);
                System.out.println("Numbers: " + count);
                double average = 1.0 * sum / count;
                System.out.println("Average: " + average);
                System.out.println("Even: " + evencount);
                System.out.println("Odd: " + oddcount);
                break;
            }
        }

    }
}
