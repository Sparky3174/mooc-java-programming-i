
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        for (String element : elements) {
            String x = String.valueOf(elements);
        }
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }

        String statement = "The collection " + this.name + " has " 
                + this.elements.size() 
                //Return a string equal to the number of elements + " element(s):" depening on whether the list is > 1.
                + String.valueOf(this.elements.size() > 1 ? " elements:" : " element:");
        
        for (String element : this.elements) {
            statement += "\n" 
                    + element;
        }

        return statement;
    }

}
