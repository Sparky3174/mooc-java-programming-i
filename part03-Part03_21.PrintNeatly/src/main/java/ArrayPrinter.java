
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        for (int i = 0; i < array.length;) {
            for (int num : array) {
                if (i == array.length - 1) {
                    System.out.print(num);
                    i++;
                } else {
                    System.out.print(num + ", ");
                    i++;
                }
            }
        }
    }
}
