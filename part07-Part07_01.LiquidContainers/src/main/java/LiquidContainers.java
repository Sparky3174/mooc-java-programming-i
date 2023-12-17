
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;
        boolean running = true;

        while (running) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = 0;
            if (parts.length > 1) {
                amount = Integer.valueOf(parts[1]);
            }
            switch (parts[0]) {
                case "add":
                    //checking to make sure that added amount is not negative
                    if (amount < 0) {
                        break;
                    }
                    first += amount;
                    //making sure the sum is not 100+
                    if (first > 100) {
                        first = 100;
                    }
                    break;
                case "move":
                    //checking to make sure that amount is not negative
                    amount = (amount < 0) ? 0 : amount;
//                    if (amount < 0) {
//                        break;
//                    }
                    first -= amount;
                    //making sure first number is not negative, if it is make sure to only add the amount that first used to have.
                    if (first < 0) {
                        second += first + amount;
                        first = 0;
                    } else {
                        second += amount;
                    }
                    //making sure second number is not 100+
                    if (second > 100) {
                        second = 100;
                    }
                    break;
                case "remove":
                    //making sure amount is not negative
                    amount = (amount < 0) ? 0 : amount;
//                    if (amount < 0) {
//                        break;
//                    }
                    second -= amount;
                    //making sure second is not negative
                    if (second < 0) {
                        second = 0;
                    }
                    break;
                case "quit":
                    running = false;
                    break;
            }
        }
    }

}
