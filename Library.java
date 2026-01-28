import java.io.*;

public class Library {
    public Library(String bookNameToBorrow) {
        try {
            FileWriter obj = new FileWriter("borrowedBooks.txt", true); // ✅ append mode
            obj.write(bookNameToBorrow + "\n"); // write each borrowed book on a new line
            obj.close();
        } catch(Exception e) {
            System.out.println("COULDN'T INSERT THE NAME!");
        }
    }

    static void savingBookName(String bookNameToRead){
        try {
            FileWriter obj = new FileWriter("savedBooks.txt", true); // ✅ append mode
            obj.write(bookNameToRead + "\n"); // write each borrowed book on a new line
            obj.close();
        } catch(Exception e) {
            System.out.println("COULDN'T INSERT THE NAME!");
        }
    }
}
