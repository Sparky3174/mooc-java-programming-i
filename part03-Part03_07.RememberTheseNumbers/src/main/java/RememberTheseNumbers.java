
import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int userin = Integer.valueOf(scanner.nextLine());
            if (userin == -1) {
                break;
            }

            numbers.add(userin);
        }
        System.out.println(numbers);

    }
}
