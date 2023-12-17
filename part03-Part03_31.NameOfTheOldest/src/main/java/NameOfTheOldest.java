
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largest = 0;
        String name = "";
        while (true) {
            String userin = String.valueOf(scanner.nextLine());
            String[] array = userin.split(",");
            if (userin.equals("")) {
                System.out.println("Name of the oldest: " + name);
                break;
            }
            if (largest < Integer.valueOf(array[1])) {
                largest = Integer.valueOf(array[1]);
                name = String.valueOf(array[0]);
            }
        }


    }
}
