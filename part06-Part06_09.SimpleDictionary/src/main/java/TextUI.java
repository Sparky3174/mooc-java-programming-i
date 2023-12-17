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
import java.util.ArrayList;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;

    }

    public void start() {
        while (true) {
            System.out.print("Command:");
            if (scanner.hasNextLine()) {
                String userin = scanner.nextLine();
                if (isCommand(userin) == true) {
                    doCommand(userin);
                }
            } else {
                break;
            }
        }
    }

    public boolean isCommand(String userIn) {
        ArrayList<String> commands = new ArrayList();
        commands.add("end");
        commands.add("add");
        commands.add("search");

        if (!(commands.contains(userIn))) {
            System.out.println("Unknown command");
            return false;
        }
        return true;
    }

    public void doCommand(String userIn) {
        if (userIn.equals("end")) {
            commandEnd(userIn);

        }
        if (userIn.equals("add")) {
            commandAdd(userIn);
        }
        if (userIn.equals("search")) {
            commandSearch(userIn);
        }
    }

    public void commandEnd(String userIn) {
        System.out.println("Bye bye!");
        return;
    }

    public void commandAdd(String userIn) {
        System.out.println("Word:");
        String word = scanner.nextLine();

        System.out.println("Translation:");
        String translation = scanner.nextLine();

        this.simpleDictionary.add(word, translation);
        return;
    }

    public void commandSearch(String userIn) {
        System.out.println("To be translated: ");
        String word = scanner.nextLine();

        if (!(simpleDictionary.translate(word) == null)) {
            System.out.println("Translation: " + simpleDictionary.translate(word));
        } else {
            System.out.println("Word " + word + " was not found");
        }
        return;
    }
}
