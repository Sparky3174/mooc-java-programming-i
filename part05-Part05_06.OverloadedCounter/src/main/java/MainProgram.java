
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter c = new Counter(2);
        
        c.increase();
        c.increase(4);
        c.decrease(2);
        c.decrease();
        
        System.out.println(c.value());
    }
}
