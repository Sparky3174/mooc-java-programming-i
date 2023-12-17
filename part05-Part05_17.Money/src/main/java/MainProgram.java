
public class MainProgram {

    public static void main(String[] args) {
        // test your class here
        Money a = new Money(10, 0);
        Money b = new Money(8, 50);
        Money c = a.minus(b);
        System.out.println(c);
        System.out.println(10 - 7 - ((0 - 40) / -100 + 1)); 
        
    }
}
