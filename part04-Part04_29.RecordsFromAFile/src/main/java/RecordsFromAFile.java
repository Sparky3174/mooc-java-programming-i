
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file");
        String file = String.valueOf(scanner.nextLine());

        try ( Scanner scanfile = new Scanner(Paths.get(file))) {

            while (scanfile.hasNextLine()) {
                String line = scanfile.nextLine();
                String[] parts = line.split(",");
                if (parts[1].contentEquals("1")) {
                    System.out.println(parts[0] + ", age: " + parts[1] + " year");
                } else {
                    System.out.println(parts[0] + ", age: " + parts[1] + " years");
                }
            }
        } catch (Exception e) {

        }

    }
}
