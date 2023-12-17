
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        int last = 0;
        int place = 0;
        while (place < list.size()) {
            if (last < list.get(place)) {
                last = list.get(place);
            }
            place++;
                    
        }
        System.out.println("The greatest number: " + last);
    }
}
