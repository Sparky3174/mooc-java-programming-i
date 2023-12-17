
public class AdvancedAstrology {

    public static void printStars(int number) {
        int i = 0;
        while (i < number) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        int i = 0;
        while (i < number) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        int i = 0;
        int spaces = size - 1;
        while (i < size) {
            i++;
            printSpaces(spaces);
            printStars(i);
            spaces--;
        }
    }

    public static void christmasTree(int height) {
        int i = 0;
        int stars = 1;
        int spaces = height - 1;
        while(i < height) {
            i++;
            printSpaces(spaces);
            printStars(stars);
            stars += 2;
            spaces--;
        }
        spaces = (stars-4)/2;
        printSpaces(spaces);
        printStars(3);
        printSpaces(spaces);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
