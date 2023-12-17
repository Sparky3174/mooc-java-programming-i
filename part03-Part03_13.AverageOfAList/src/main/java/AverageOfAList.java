
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int userin = Integer.valueOf(scanner.nextLine());
            if (userin == -1) {
                break;
            }
            list.add(userin);
        }
        
        double sum = list.get(0); //sum is index 0
        double average = 0; //state var average
        for (int i = 1; i < list.size(); i++){ //loop from 2nd index until last
            sum = sum + list.get(i);//add sum and index var
            average = sum / list.size();//average total sum
        }
        if (list.size() == 1) {
            average = sum /1;
        }
        System.out.println("Average: " + average);//print average
        
            

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
    }
}
