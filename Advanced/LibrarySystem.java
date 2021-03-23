import java.util.Scanner;
import java.lang.*;
import java.util.Random;

/**
 * Problem Statement : Create a Java Library Class for a Library Management
 * System. Methods to Implement : a) addBook() b) issueBook() c) returnBook() d)
 * showAvailable(). Properties : Array/interface to Store available Book, Array
 * to store issued books.
 * 
 * [Parts of the Source Code are incomplete.]
 */
class Books {
    protected int ID;
    protected String name;
    protected String bookName;
    static int counter = 0; // to keep track of the book collection.
    protected static String available[] = new String[10];
    protected static String issued[] = new String[10];

    Books() {
        this.ID = 0;
        this.name = "Not Available";
        this.bookName = "Not Available";
    }

    Books(int ID, String name, String bookName) {

        this.ID = ID;
        this.name = name;
        this.bookName = bookName;
        available[counter++] = this.bookName;
        System.out.println("Book(" + counter + ") Added by USER #" + this.ID);
    }

    public void DisplayAvailable() {
        System.out.println("Available Books : ");
        for (int i = 0; i < counter; i++)
            System.out.println(i + 1 + ") " + available[i]);

        return;
    }
};

public class LibrarySystem extends Books {
    protected final int CUSTID;
    static int userID; // for static block reference. Needs to be resolved.
    static boolean issueStatus[] = new boolean[10]; // Initially.
    {
        for (int i = 0; i < 10; i++)
            issueStatus[i] = false;
    }

    static Scanner sc = new Scanner(System.in);

    LibrarySystem() {
        System.out.println("Enter the USERID : ");
        this.CUSTID = sc.nextInt();
        userID = this.CUSTID;
        LibrarySystem.DisplayMenu();
    }

    static void DisplayMenu() {
        System.out.println("~~ Welcome to Java Library Management System ~~");
        System.out.println(
                "Enter 1 : To AddBook\nEnter 2 : To Check Available book\nEnter 3 : To IssueBook\nEnter4 : To return the book\nEnter 0 : To exit()");
        int ch = 0;
        try {
            do {
                System.out.println("Enter Choice : ");
                ch = sc.nextInt();

                if (ch == 1) {
                    LibrarySystem.addBook();
                } else if (ch == 2) {
                    new Books().DisplayAvailable(); // Anonymous Object to preview available.
                } else if (ch == 3) {
                    LibrarySystem.issueBook();
                } else if (ch == 4) {
                    LibrarySystem.returnBook();
                } else {
                    System.out.println("Thank You for Using Java LibrarySystem!\nCode Terminated :)");
                    System.exit(0);
                }
            } while (ch != 0);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void addBook() {
        System.out.println("Welcome to AddBook Section!");
        System.out.println("Enter Your Name : ");
        String buffer = sc.next(); // to prevent temporary buffer error.
        String username = sc.nextLine();
        System.out.println("Enter the BookCover Title : ");
        String book = sc.nextLine();
        Books newBook = new Books(userID, username, book);

    }

    static void issueBook() {
        System.out.println("Welcome to the Issue Section : #" + userID);
        String options;
        System.out.println("Following are the Available Books : ");
        for (int i = 0; i < counter; i++) {
            System.out.println(i + 1 + ") " + available[i]);
        }
        try {
            // System.out.println("Enter your pick : ");
            // String buffer = sc.next(); // to prevent temporary buffer error.
            // options = sc.nextLine();
            System.out.println("Enter the Book Index Val : ");
            int index = sc.nextInt();

            issueStatus[counter] = true; // ISSUED

            for (int i = 0; i < counter; i++) {
                if (index < counter && (index >= 0)) {
                    System.out.println("Book : " + available[index] + " issued by #" + userID);
                } else {
                    System.out.println("Sorry! Book is unavailable RN");
                    return;
                }
            }
        } catch (Exception e) {
            System.out.println("Error Occured! : " + e);
        }
    }

    static void returnBook() {
        String buffer = sc.next();
        System.out.println("Enter the Book to be Returned!");
        String options = sc.nextLine();
        for (int i = 0; i < counter; i++) {
            if (available[i] == options) {
                if (issueStatus[i] == true) {
                    System.out.println("Book(" + options + ") Returned by User #" + userID);
                    issueStatus[i] = false; // Update the Issue status to false -> Indicating Available.
                    return;
                }
            }
        }
        System.out.println("Books was not Issued from here! Unavailable to add to record!");
        return;
    }

    public static void main(String[] args) {
        // Object Creation => New User sign-up to the Library Management System.
        // Rest of the automatically parsed.
        LibrarySystem object = new LibrarySystem();
    }
}
