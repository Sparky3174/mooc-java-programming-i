
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String userin = String.valueOf(scanner.nextLine());
            String[] array = userin.split(" ");
            if (userin.equals("")) {
                break;
            } else {
                for (int i = 0; i < array.length;) {
                    for (String word : array) {
                        if (word.contains("av")) {
                            System.out.println(word);
                        }
                        i++;
                    }
                }
            }
        }
    }
}
