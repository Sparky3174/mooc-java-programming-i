
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        removeLast(list);
        System.out.println(list);
    }
    public static void removeLast(ArrayList<String> list) {
        if (list.size() == 0) {
            return;
        }
        list.remove(list.size() - 1);
    }

}
