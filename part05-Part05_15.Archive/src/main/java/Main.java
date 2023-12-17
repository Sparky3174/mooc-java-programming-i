
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList Items = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String id = String.valueOf(scanner.nextLine());
            if (id.isBlank()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = String.valueOf(scanner.nextLine());
            if (name.isBlank()) {
                break;
            }
            Item item = new Item(id, name);
            if (!(Items.contains(item))) {
                Items.add(item);
            }

        }
        System.out.println("==Items==");
        for (Object i : Items) {
            System.out.println(i);
        }
    }
}
