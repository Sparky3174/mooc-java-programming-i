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

    private JokeManager manager;
    private Scanner scanner;

    public UserInterface(JokeManager manager, Scanner scanner) {
        this.manager = manager;
        this.scanner = scanner;
    }

    public void start() {
        boolean running = true;
        while (running) {
            printSelection();
            running = selectCommand();
        }
    }

    public void printSelection() {
        System.out.println("Commands:");
        System.out.println(" 1 - add a joke");
        System.out.println(" 2 - draw a joke");
        System.out.println(" 3 - list jokes");
        System.out.println(" X - stop");
    }

    public boolean selectCommand() {
        String command = scanner.nextLine();
        switch (command) {
            case "1":
                addJoke();
                break;
            case "2":
                drawJoke();
                break;
            case "3":
                listJokes();
                break;
            case "X":
                exit();
                return false;
        }
        return true;
    }

    public void exit() {
        return;
    }

    public void addJoke() {
        System.out.println("Write the joke to be added:");
        String joke = scanner.nextLine();
        manager.addJoke(joke);
    }

    public void drawJoke() {
        System.out.println("Drawing a joke.");
        System.out.println(manager.drawJoke());
    }

    public void listJokes() {
        System.out.println("Printing the jokes.");
        manager.printJokes();
    }
}
