/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andre
 */
import java.util.Scanner;

public class UserInterface {

    private Container firstContainer;
    private Container secondContainer;
    private Scanner scanner;

    public UserInterface(Container firstContainer, Container secondContainer, Scanner scanner) {
        this.firstContainer = firstContainer;
        this.secondContainer = secondContainer;
        this.scanner = scanner;
    }

    public void start() {
        boolean programIsRunning = true;
        while (programIsRunning) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);

            String userInput = scanner.nextLine();
            String[] parts = userInput.split(" ");
            String command = parts[0];
            int amount = 0;
            if (parts.length > 1) {
                amount = Integer.valueOf(parts[1]);
            }

            switch (command) {
                case "add":
                    firstContainer.add(amount);
                    break;

                case "move":
                    firstContainer.move(amount, secondContainer);
                    break;

                case "remove":
                    secondContainer.remove(amount);
                    break;

                case "quit":
                    programIsRunning = false;
                    break;

            }
        }
    }
}
