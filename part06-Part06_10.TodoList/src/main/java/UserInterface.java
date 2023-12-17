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

    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {
        boolean running = true;
        while (running) {
            System.out.println("Command:");
            String userin = scanner.nextLine();
            running = doCommand(userin);
        }
    }

    public boolean doCommand(String userin) {
        if (userin.equals("add")) {
            System.out.println("To add:");
            todoList.add(scanner.nextLine());
        }
        if (userin.equals("remove")) {
            System.out.println("Which one is removed?");
            int remove = Integer.valueOf(scanner.nextLine());
            todoList.remove(remove);
        }
        if (userin.equals("list")) {
            todoList.print();
        }
        if (userin.equals("stop")) {
            return false;
        }
        return true;
    }
}
