
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String userin = String.valueOf(scanner.nextLine());
            String[] array = userin.split(" ");
            if (userin.equals("")) {
                break;
            } else {
                for (int i = 0; i < array.length;) {
                    for (String userins : array) {
                        System.out.println(userins);
                        i++;
                    }
                }
            }
        }
    }

}
