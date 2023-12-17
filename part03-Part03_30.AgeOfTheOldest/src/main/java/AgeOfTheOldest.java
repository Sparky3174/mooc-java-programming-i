
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largest = 0;
        while (true) {
            String userin = String.valueOf(scanner.nextLine());
            String[] array = userin.split(",");
            if (userin.equals("")) {
                System.out.println("Age of the oldest: " + largest);
                break;
            } else {
                if (largest < Integer.valueOf(array[1])) {
                    largest = Integer.valueOf(array[1]);
                }
            }

        }
        
    }
}
