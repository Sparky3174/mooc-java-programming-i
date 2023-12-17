
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeRegister register = new GradeRegister();
        UserInterface ui = new UserInterface(register, scanner);
        
        register.addGradeBasedOnPoints(93);
        register.addGradeBasedOnPoints(76);
        register.addGradeBasedOnPoints(40);

        ui.printGradeDistribution();
    }
}
