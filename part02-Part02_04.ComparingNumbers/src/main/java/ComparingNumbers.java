
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = Integer.valueOf(scanner.nextLine());
        int value2 = Integer.valueOf(scanner.nextLine());
        if (value > value2) {
            System.out.println(value + " is greater than " + value2);
        } else if (value2 > value) {
            System.out.println(value + " is smaller than " + value2);
        } else {
            System.out.println(value + " is equal to " + value2);
        }
    }
}
