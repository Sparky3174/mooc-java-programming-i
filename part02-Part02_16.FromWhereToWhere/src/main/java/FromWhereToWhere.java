
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        int userin = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int userout = Integer.valueOf(scanner.nextLine());
        int num = userout;
        while (num <= userin) {
            System.out.println(num);
            num++;
        }
    }
}
