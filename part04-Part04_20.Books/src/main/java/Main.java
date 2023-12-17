
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
//            System.out.println("Title: ");
            String title = String.valueOf(scanner.nextLine());
            if (title.isEmpty()) {
                break;
            }
//            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
//            System.out.println("Publication year: ");
            int publicationyear = Integer.valueOf(scanner.nextLine());
            books.add(new Book(title, pages, publicationyear));

        }
//        System.out.println("What information will be printed? ");
        String whatToPrint = String.valueOf(scanner.nextLine());
        if (whatToPrint.equals("everything")) {
            for (int i = 0; i < books.size(); i++) {
                System.out.println(books.get(i).toString());
            }
        }
        if (whatToPrint.equals("name")) {
            for (int i = 0; i < books.size(); i++) {
                System.out.println(books.get(i).getTitle());
            }
        }

    }
}
