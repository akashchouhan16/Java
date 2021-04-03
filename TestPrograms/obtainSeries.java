import java.util.Scanner;

interface Series {
    int MAX = 20;
    String errorMessage = "Cannot go beyond the Max limit of : " + MAX;

    // Methods to implement.
    void getNext();

    default void displayMessage() {
        // this is a default interface method and hence can have a body but can also be
        // overwritten by the class's implementation.
        System.out.println("Implementing a Series Interface for 2's Increment....");
    }
}

interface Series3 extends Series {
    void getPrev(); // to get the previous Series Term.

    default void displayMessage() {
        System.out.println("Implementing a Series Interface for 3's Increment....");
    }
}

public class obtainSeries implements Series3 {
    // Class Attributes
    int value = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Since it is Static, we can Acces Data Attributes Directly.
        System.out.println(MAX + " Is the Series Limit");
        int choice;
        obtainSeries obj = new obtainSeries();
        System.out.println("Enter 1 to get next Element\nEnter 2 to get the previous element\nEnetr 0 to exit().");
        do {
            System.out.print("Enter Choice : ");
            choice = sc.nextInt();
            switch (choice) {
            case 0:
                System.out.println("Terminating Code......");
                System.exit(0);
                break;
            case 1:
                obj.getNext();
                break;
            case 2:
                obj.getPrev();
                break;
            default:
                System.out.println("Invalid Choice... Try again");
            }
        } while (true);

    }

    @Override
    public void getPrev() {
        // if (value < -10) {
        // System.out.println(errorMessage);
        // } else {
        // value -= 2;
        // }
        value = (value <= -10) ? value : (value -= 2);

        System.out.println(value + " ");
    }

    @Override
    public void getNext() {
        // if (value > MAX) {
        // System.out.println(errorMessage);
        // } else {
        // value += 2;
        // }
        value = (value >= MAX) ? value : (value += 2);
        System.out.println(value + " ");
    }
}
