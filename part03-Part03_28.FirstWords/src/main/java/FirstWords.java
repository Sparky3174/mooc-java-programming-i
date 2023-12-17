
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String userin = String.valueOf(scanner.nextLine());
            String[] array = userin.split(" ");
            if (userin.equals("")) {
                break;
            } else {
                System.out.println(array[0]);
            }
        }


    }
}
