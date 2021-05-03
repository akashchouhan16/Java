import java.util.Scanner;

import javax.print.attribute.SupportedValuesAttribute;

import jdk.swing.interop.DispatcherWrapper;

class Factorial {
    int num;
    long result;
    static Scanner sc = new Scanner(System.in);

    Factorial() {
        System.out.print("Enter a Number : ");
        this.num = sc.nextInt();
        this.result = Factorial.Compute(this.num);

        // Output
        Display();
    }

    static long Compute(int x) {
        if (x == 0 || x == 1)
            return 1;
        else
            return Compute(x - 1) * x;
    }

    void Display() {
        System.out.println("Factorial of " + this.num + " is = " + this.result);
        return;
    }
}

public class FactAnonymous {
    public static void main(String[] args) {
        new Factorial(); // Anonymous Obj.

        return;
    }
}
