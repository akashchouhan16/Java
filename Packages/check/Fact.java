package check;

import java.util.Scanner;
public class Fact {
    int num;
    static Scanner sc = new Scanner(System.in);

    public Fact(){
        System.out.print("Enter the Number : ");
        this.num = sc.nextInt();
    }
    public int factorial(){
        if(this.num==0 || this.num ==1)
            return 1;
        else
            return (factorial(this.num-1)*(this.num));
    }
};
