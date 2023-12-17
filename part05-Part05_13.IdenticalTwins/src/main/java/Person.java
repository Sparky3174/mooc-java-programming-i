
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects
    public boolean equals(Object compared) {
        //if the object is an exact match, return true
        if(this == compared) {
            return true;
        }
        //if the compared object isn't a person at all, then return false
        if(!(compared instanceof Person)) {
            return false;
        }
        //convert object to a person if it is a person
        Person comparedPerson = (Person) compared;
        
        //compare converted person object to current person, if their variables match then return true.
        if(this.birthday.equals(comparedPerson.birthday) && this.height == comparedPerson.height && this.weight == comparedPerson.weight && this.name == comparedPerson.name) {
            return true;
        } else {
            return false;
        }
    }
}
