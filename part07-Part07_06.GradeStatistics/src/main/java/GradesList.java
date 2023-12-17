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

public class GradesList {

    private ArrayList<Integer> grades;

    public GradesList(ArrayList grades) {
        this.grades = grades;
    }

    public int numberOfPassingGrades() {
        int passing = 0;
        for (int grade : grades) {
            if (grade >= 50) {
                passing += 1;
            }
        }
        return passing;
    }

    public double averageOfGrades() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / this.grades.size();
    }

    public double averageOfPassingGrades() {
        double sum = 0;
        double passing = 0;
        for (int grade : grades) {
            if (grade >= 50) {
                sum += grade;
                passing++;
            }
        }
        return sum / passing;

    }

    public double percentOfPassingGrades() {
        return 100.0 * numberOfPassingGrades() / this.grades.size();
    }

    public int findAmountOfGrade(int minNum, int maxNum) {
        int numberOfGrade = 0;
        for (int grade : grades) {
            if (grade <= maxNum && grade >= minNum) {
                numberOfGrade += 1;
            }
        }
        return numberOfGrade;
    }
}
