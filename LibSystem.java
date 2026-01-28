//This class will be used as main class to run the code.

import java.util.*;

public class LibSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book books = new Book(); 

        System.out.println("\n\n\nWELCOME TO THE LIBRARY SYSTEM");
        System.out.println("\nBOOKS AVAILABLE :");
        books.displayBook();   

        System.out.print("\nARE YOU ADMIN(1) OR USER(2)? ");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline


        //ADMIN'S CASE :

        if (choice == 1) {
            System.out.print("DO YOU WANT TO ADD A BOOK OR DELETE A BOOK? ");
            String adminChoice = sc.nextLine();

            if (adminChoice.equalsIgnoreCase("ADD")) {
                System.out.print("Enter the name of the book to ADD : ");
                String bookName = sc.nextLine();
                books.addBook(bookName);
                System.out.println("\nUPDATED BOOKS AVAILABLE:");
                books.displayBook();
            } else {
                System.out.print("Enter the number of the book to DELETE : ");
                int bookNumber = sc.nextInt();
                sc.nextLine();
                books.removeBook(bookNumber);
                System.out.println("\nUPDATED BOOKS AVAILABLE:");
                books.displayBook();
            }

        }
        
    //READER'S CASE :    

        else {
            System.out.print("DO YOU WANT TO READ A BOOK OR BORROW A BOOK? ");
            String userChoice = sc.nextLine();

            if (userChoice.equalsIgnoreCase("READ")) {
                System.out.println("\nYou can read the following books:");
                books.displayBook();
                System.out.println("\nENTER THE NAME OF THE BOOK YOU WANT TO READ : ");
                String bookNameToRead = sc.nextLine();
                if (books.hasBook(bookNameToRead)) {
                    for (String b : books.getBooks()) {
                        if (b.equalsIgnoreCase(bookNameToRead)) {
                            System.out.println("You have Chossen: " + bookNameToRead); 
                            Library library = new Library(bookNameToRead); // Moved here
                            library.savingBookName(bookNameToRead);
                            break;
                        }
                    }
                } else {
                    System.out.println("Book not available for borrowing.");
                }
            } 
            else {
                System.out.println("You can borrow a book from the library.");
                System.out.print("Enter the book NAME TO BORROW : ");
                String bookNameToBorrow = sc.nextLine();

                if (books.hasBook(bookNameToBorrow)) {
                    for (String b : books.getBooks()) {
                        if (b.equalsIgnoreCase(bookNameToBorrow)) {
                            System.out.println("You have borrowed: " + bookNameToBorrow); 
                            Library library = new Library(bookNameToBorrow); // Moved here
                            break;
                        }
                    }
                } else {
                    System.out.println("Book not available for borrowing.");
                }
            }
        }
        sc.close(); // good practice to close Scanner
    }
}
