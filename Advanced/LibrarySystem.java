import java.util.Scanner;

/**
 * Problem Statement : Create a Java Library Class for a Library Management
 * System. Methods to Implement : a) addBook() b) issueBook() c) returnBook() d)
 * showAvailable(). Properties : Array/interface to Store available Book, Array
 * to store issued books.
 */
class Books {
    protected int ID;
    protected String name;
    protected String bookName;

    Books() {
        this.ID = 0;
        this.name = "Not Available";
        this.bookName = "Not Available";
    }

    Books(int ID, String name, String bookName) {
        this.ID = ID;
        this.name = name;
        this.bookName = bookName;
        System.out.println("Book Added by USER #" + this.ID);
    }
};

public class LibrarySystem extends Books {
    protected final int CUSTID;
    static int userID; // for static block reference. Needs to be resolved.
    boolean issueStatus = false; // Initially.
    protected String available[];
    protected String issued[];
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
        do {
            System.out.println("Enter Choice : ");
            ch = sc.nextInt();

            if (ch == 1) {
                addBook();
            } else {
                System.out.println("Code terminated!");
                System.exit(0);
            }
        } while (ch != 0);
    }

    static void addBook() {
        System.out.println("Welcome to AddBook Section!");
        System.out.println("Enter Your Name : ");
        String username = sc.nextLine();
        System.out.println("Enter the BookCover Title : ");
        String book = sc.nextLine();
        Books newBook = new Books(userID, username, book);

    }

    public static void main(String[] args) {
        LibrarySystem object = new LibrarySystem();

    }
}
