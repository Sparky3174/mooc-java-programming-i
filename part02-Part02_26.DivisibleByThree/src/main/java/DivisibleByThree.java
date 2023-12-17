
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(Integer.valueOf(scanner.nextLine()), Integer.valueOf(scanner.nextLine()));
        

    }
    public static void divisibleByThreeInRange(int beginning, int end){
        while ((beginning-1) < (end+1)) {
            if (beginning % 3 == 0) {
                System.out.println(beginning);
            }
            beginning++;
        }
    }

}
