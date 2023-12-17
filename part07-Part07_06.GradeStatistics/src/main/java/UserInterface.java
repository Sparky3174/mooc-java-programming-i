/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andre
 */
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private ArrayList<Integer> grades;
    private Scanner scanner;
    private GradesList gradesList;

    public UserInterface(ArrayList grades, Scanner scanner) {
        this.grades = grades;
        this.scanner = scanner;
        this.gradesList = new GradesList(grades);
    }

    public void start(ArrayList grades, Scanner scanner) {
        userInput(grades, scanner);
        printGradeAverage();
        printPassingGradeAverage();
        printPassingGradePercentage();
        printGradeDistribution();
    }

    public void userInput(ArrayList grades, Scanner scanner) {
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

    public void printGradeAverage() {
        System.out.println("Point average (all): " + gradesList.averageOfGrades());
    }

    public void printPassingGradeAverage() {
        if (gradesList.averageOfPassingGrades() > 0) {
            System.out.println("Point average (passing): " + gradesList.averageOfPassingGrades());
        } else {
            System.out.println("Point average (passing): -");
        }
    }

    public void printPassingGradePercentage() {
        System.out.println("Pass percentage: " + gradesList.percentOfPassingGrades());
    }

    public void printGradeDistribution() {
        System.out.println("5: " + numOfStars(gradesList.findAmountOfGrade(90, 100)));
        System.out.println("4: " + numOfStars(gradesList.findAmountOfGrade(80, 89)));
        System.out.println("3: " + numOfStars(gradesList.findAmountOfGrade(70, 79)));
        System.out.println("2: " + numOfStars(gradesList.findAmountOfGrade(60, 69)));
        System.out.println("1: " + numOfStars(gradesList.findAmountOfGrade(50, 59)));
        System.out.println("0: " + numOfStars(gradesList.findAmountOfGrade(0, 49)));
    }

    public String numOfStars(int numOfStars) {
        String stars = "";
        for (int i = 0; i < numOfStars; i++) {
            stars += "*";
        }
        return stars;
    }
}
