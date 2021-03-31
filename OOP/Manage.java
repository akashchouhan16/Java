import java.util.*;

abstract class Account {
    protected String accUser;
    protected int accNo;
    protected int balance;
    static Scanner sc = new Scanner(System.in);

    Account() {
        this.accUser = "Not Available";
        this.accNo = 10001;
        this.balance = 0;
        Account.getData(this);
    }

    Account(String name) {
        this();
        this.accUser = name;
    }

    static void getData(Account user) {
        System.out.print("Enter Account Number : ");
        user.accNo = sc.nextInt();
        System.out.print("Enter Account User Name : ");

        user.accUser = sc.nextLine();
    }

    abstract void Disp();;
};

class Person extends Account {
    String userID;
    final static int aadharNo; // Once initialize for an instance, cannot be updated.

    static {
        System.out.println("Enter [Aadhar Number]  : ");
        aadharNo = sc.nextInt();
    }

    Person() {
        super();
        System.out.println("Enter the Person's UserId : ");
        this.userID += sc.nextLine();
    }

    @Override
    void Disp() {
        System.out.println("Person Details : ");
        System.out.println("UserId : " + this.userID);
        System.out.println("Name : " + this.accUser);
        System.out.println("Account Number : " + this.accNo);
        System.out.println("Aadhar Number : " + this.aadharNo);

    }
};

public class Manage {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.Disp();
        return;
    }
}
