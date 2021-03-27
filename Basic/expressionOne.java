
// To evaluate (v^2 + u^2)/ 2aS.
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

import java.math.*;
import java.security.DrbgParameters.Reseed;

class GradeEncrypt {
    private char grade;
    public static String Result;
    static {
        Result = "";
    }
    static Scanner sc = new Scanner(System.in);

    GradeEncrypt() {
        System.out.println("Enter the Grade to Encrypt : ");
        this.grade = sc.next().charAt(0);
        GradeEncrypt.encrypt(this);
    }

    static void encrypt(GradeEncrypt object) {
        char res = (char) (object.grade + 8);
        String resIn = "iDoasD239naCnA" + res + "U7@&encrypted";
        Result = Result.concat(resIn);
        System.out.println("Grade encrypted..");
    }

    public static void DisplayGrade() {
        System.out.println("Student Grade : " + Result);
    }

    static void decrypt(GradeEncrypt object) {
        // String resout = ((char) (object.grade - 8));
        System.out.println("Grade decrypted....");
        Result = "";
        Result += object.grade;
        return;
    }
};

public class expressionOne {
    public int v, u;
    public float a, S;
    public static double result;
    {
        result = 0.0f;
    }
    static Scanner sc = new Scanner(System.in);

    expressionOne() {
        System.out.println("Enter the value for Final(v) and initial(u) Velocity : ");
        this.v = sc.nextInt();
        this.u = sc.nextInt();
        System.out.println("Enter the acc and Distance : ");
        this.a = sc.nextFloat();
        this.S = sc.nextFloat();
    }

    static double compute(expressionOne ob) {
        result = Math.pow((double) ob.v, 2.0f);
        result += Math.pow((double) ob.u, 2.0f);
        result /= 2 * ob.a * ob.S;
        System.out.println("Result : " + result);
        return result;
    }

    public static void main(String[] args) {
        // expressionOne ob = new expressionOne();
        // expressionOne.compute(ob);

        // ******* Question on TypeCast. *******
        GradeEncrypt object = new GradeEncrypt();
        GradeEncrypt.DisplayGrade();
        GradeEncrypt.decrypt(object);
        GradeEncrypt.DisplayGrade();
    }
};
