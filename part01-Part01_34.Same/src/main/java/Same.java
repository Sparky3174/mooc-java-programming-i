
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here. 
        System.out.println("Enter the first string:");
        String a = String.valueOf(scan.nextLine());
        System.out.println("Enter the second string:");
        String b = String.valueOf(scan.nextLine());
        if (a.equals(b)){
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
        
    }
}
