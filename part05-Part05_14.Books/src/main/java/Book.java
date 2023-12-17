
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    @Override
    public boolean equals(Object compared) {
        System.out.println("triggered");
        if (compared == this) {
            System.out.println("direct match");
            return true;
        }
        if (!(compared instanceof Book)) {
            System.out.println("not book");
            return false;
        }
        
        Book comparedBook = (Book) compared;
        if(comparedBook.name.equals(this.name) && comparedBook.publicationYear == this.publicationYear) {
            System.out.println("convert match");
            return true;
        } else {
            System.out.println("convert no match");
            return false;
        }
    }

}
