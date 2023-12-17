
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        int sum = 0;
        int nums = 0;
        while (true) {
            String userin = String.valueOf(scanner.nextLine());
            String[] array = userin.split(",");
            if (userin.equals("")) {
                System.out.println("Longest name:" + longestName);
                System.out.println("Average of the birth years: " + sum * 1.0 / nums);
                break;
            } else {
                if (longestName.length() < array[0].length()) {
                    longestName = array[0];
                }
                sum = sum + Integer.valueOf(array[1]);
                nums++;
            }
        }

    }
}
