
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numberofnumbers = 0;
        while (true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if (num !=0) {
                sum = sum + num;
                numberofnumbers = numberofnumbers + 1;
            } else {
                System.out.println("Number of numbers: " + numberofnumbers);
                System.out.println("Sum of the numbers: " + sum);
                break;
            }
        } 

    }
}
