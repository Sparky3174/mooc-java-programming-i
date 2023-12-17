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

public class UserInterface {

    private ArrayList<Bird> birds;
    private Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.birds = new ArrayList<>();
        this.scanner = scanner;
    }

    public void start() {
        getUserCommand(scanner);

    }

    public void getUserCommand(Scanner scanner) {
        boolean programIsRunning = true;
        while (programIsRunning) {
            System.out.println("?");
            String userInput = scanner.nextLine();
            switch (userInput) {
                case "Add":
                    System.out.println("Name: ");
                    String name = scanner.nextLine();
                    System.out.println("Name in Latin:");
                    String latinName = scanner.nextLine();
                    birds.add(new Bird(name, latinName));
                    break;
                case "Observation":
                    System.out.println("Bird?");
                    String observedBirdName = scanner.nextLine();
                    if(findBirdByName(observedBirdName) != null) {
                    findBirdByName(observedBirdName).addObservation();
                    break;
                    }
                    System.out.println("Not a bird!");
                    break;
                case "All":
                    printAllBirds();
                    break;
                case "One":
                    System.out.println("Bird?");
                    String selectedBirdName = scanner.nextLine();
                    printOneBird(findBirdByName(selectedBirdName));
                    break;
                case "Quit":
                    programIsRunning = false;
                    break;
            }
        }
    }

    public void printAllBirds() {
        for (Bird bird : birds) {
            System.out.println(bird);
        }

    }

    public void printOneBird(Bird bird) {
        System.out.println(bird);
    }

    public Bird findBirdByName(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                return bird;
            }
        }
        return null;
    }

    public void addBird(Bird bird) {
        birds.add(bird);
    }

}
