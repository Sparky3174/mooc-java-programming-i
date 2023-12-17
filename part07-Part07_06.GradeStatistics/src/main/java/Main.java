
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();
        UserInterface ui = new UserInterface(grades, scanner);
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        ui.start(grades, scanner);
        
    }
    
    public void userInput(ArrayList<Integer> grades, Scanner scanner) {
        while (true) {
            System.out.println("Enter point totals, -1 stops:");
            int userin = Integer.valueOf(scanner.nextLine());
            if (userin >= 0 && userin <= 100) {
                grades.add(userin);
            }
            if (userin == -1) {
                break;
            }
        }
    }
}
