
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number?");
        int userfirst = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        int userin = Integer.valueOf(scanner.nextLine());
        int last = userfirst;
        int sum = 0;
        int num = userfirst;
        int count = userfirst;
        while (count != userin) {
            num++;
            sum = num + last;
            last = sum;
            count++;
        }
        System.out.println("The sum is: " + sum);
    }

}
