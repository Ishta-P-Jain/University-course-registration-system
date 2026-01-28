import java.util.ArrayList;



public class Book{

    ArrayList<String> abook = new ArrayList<String>();

    public Book(){
        abook.add("The Great Gatsby");
        abook.add("1984");
        abook.add("To Kill a Mockingbird");
        abook.add("Pride and Prejudice");
        abook.add("The Catcher in the Rye");        
        abook.add("The Lord of the Rings");
        abook.add("The Hobbit");
        abook.add("Fahrenheit 451");
        abook.add("Brave New World");
        

    }

    public void displayBook(){
        int i = 1;
        for(String b : abook) {
            System.out.println(i + ". " + b);
            i++;
        }
    }

    public void addBook(String bookName) {
        abook.add(bookName);
        System.out.println("Book added successfully!");
    }

    public void removeBook(int bookNumber){
        if (bookNumber >= 1 && bookNumber <= abook.size()) {
            String removed = abook.remove(bookNumber - 1);
            System.out.println("Removed: " + removed);
        } else {
            System.out.println("Invalid book number!");
        }
    }

    public boolean hasBook(String name) {
    for (String b : abook) {
        if (b.equalsIgnoreCase(name)) {
            return true;
        }
    }
    return false;
}

public ArrayList<String> getBooks() {
    return abook;
}

    
    
}


