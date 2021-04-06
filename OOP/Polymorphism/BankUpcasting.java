import java.util.Scanner;

//To demonstrate how upcasting plays a vital role in allowing Dynamic Method Dispatch.
class Bank {
    Bank() {
        System.out.println("Bank Construct.");
    }

    float getRate() {
        return 0;
    }
};

class SBI extends Bank {
    SBI() {
        System.out.print("For SBI Bank : ");
    }

    float getRate() {
        return 8.4f;
    }
};

class ICICI extends Bank {
    ICICI() {
        System.out.print("For ICICI Bank : ");
    }

    float getRate() {
        return 7.3f;
    }
};

public class BankUpcasting {
    public static void main(String[] args) {
        Bank BaseObject;
        BaseObject = new SBI(); // Upcasting, Runtime Polymorphism
        System.out.println(BaseObject.getRate() + "% is the Rate.");

        BaseObject = new ICICI(); // Upcasting, Runtime Polymorphism
        System.out.println(BaseObject.getRate() + "% is the Rate.");
    }
}
