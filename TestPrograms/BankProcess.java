import java.util.*;

class BankAccount {
    int accountNumber;
    String accountName;
    String Type;
    float balance;
    static Scanner sc = new Scanner(System.in);

    protected void getDetails() {
        System.out.println("Enter Bank Details : ");
        System.out.print("Enter Acc Number : ");
        // // Buffer Error.
        this.accountNumber = sc.nextInt();
        System.out.print("Enter Acc Name : ");
        // String buffer = sc.next();
        this.accountName = sc.nextLine();
        System.out.print("Enter Acc Type : ");
        this.Type = sc.nextLine();
        System.out.println("Enter Current Acc balance : ");
        this.balance = sc.nextFloat();
        System.out.println("Bank Detials Saved!");
        return;
    };

    protected void printDetails() {
        System.out.println("Displaying Account Details for Account Number : #" + this.accountNumber);
        System.out.println("Name : " + this.accountName + "\nType : " + this.Type + "\nBalance : " + this.balance);
        return;
    };
}

public class BankProcess extends BankAccount {
    float amount; // instance variable.

    BankProcess() {
    }

    void Deposit() {
        System.out.println("Enter the Deposit Amount : ");
        amount = sc.nextInt();
        this.balance += (float) (this.amount);
        System.out.println("Balance after Deposit : " + this.balance);
    }

    void withdraw() {
        System.out.println("Enter Withdraw Amount : ");
        amount = sc.nextInt();
        if (amount >= this.balance) {
            System.out.println("Cannot Withdraw Amount! : Current Balance : " + this.balance);
            return;
        } else {
            this.balance -= (float) (this.amount);
        }
        System.out.println("Balance after Withdraw : " + this.balance);
        return;
    }

    public static void main(String[] args) {
        BankProcess User1 = new BankProcess();
        User1.getDetails();
        User1.printDetails();

        User1.Deposit();
        User1.withdraw();
        return;
    }
}