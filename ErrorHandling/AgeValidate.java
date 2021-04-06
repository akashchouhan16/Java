import java.util.*;
import java.io.*;

class AgeException extends Exception {
    public AgeException(String s) {
        super(s);
    }
}

public class AgeValidate {
    static Scanner sc = new Scanner(System.in);
    int age;

    public static void main(String[] args) {
        AgeValidate obj = new AgeValidate();
        System.out.println("Enter your Age : ");
        obj.age = sc.nextInt();
        try {
            if (obj.age < 18) {
                throw new AgeException("Not Allowed to vote.");
            } else {
                System.out.println("Valid Age, Allowed to vote.");
            }
        } catch (AgeException e) {
            System.out.println(e);
        }
    }
}
