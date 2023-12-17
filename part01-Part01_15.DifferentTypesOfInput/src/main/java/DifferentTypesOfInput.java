
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String s = scanner.nextLine();
        System.out.println("Give an integer:");
        int i = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double:");
        double d = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean:");
        boolean b = Boolean.valueOf(scanner.nextLine());
        System.out.println("You gave the string " + s);
        System.out.println("You gave the integer " + i);
        System.out.println("You gave the double " + d);
        System.out.println("You gave the boolean " + b);
        
        

    }
}
