import java.util.Scanner;

public class Fibonacci {

    private int terms;
    int result;
    static Scanner sc = new Scanner(System.in);
    {
        result = 0;
    }

    Fibonacci() {
        System.out.println("Enter the No of Terms : ");
        this.terms = sc.nextInt();
    }

    void compute() {
        int a = 0, b = 1;
        int counter = this.terms - 2;
        System.out.print("Series : " + a + ", " + b + ", ");
        while (counter > 0) {
            result = a + b;
            System.out.print(result + ", ");
            a = b;
            b = result;
            counter--;
        }
        return;
    }

    public static void main(String args[]) {
        Fibonacci obj = new Fibonacci();
        obj.compute();
    }
};
