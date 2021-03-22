import java.util.Scanner;

public class Factorial {
    int num;
    static Scanner sc = new Scanner(System.in);

    public int Fact(int num) {
        if (num == 0 || num == 1)
            return 1;
        else
            return num * Fact(num - 1);
    }

    int getNum() {
        return this.num;
    }

    public void Input() {
        System.out.println("Enter the Number : ");
        this.num = sc.nextInt();
        return;
    }

    public static void main(String[] args) {
        Factorial obj = new Factorial();
        obj.Input();
        long result = obj.Fact(obj.getNum());

        System.out.println("Factorial : " + result);
    }
}
