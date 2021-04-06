import java.io.*;
import java.util.*;

class HourException extends Exception {
    public HourException(String s) {
        super(s);
    }
}

public class TimeException {
    static Scanner sc = new Scanner(System.in);
    int hour;

    void Input() {
        System.out.println("Enter Time in Hr : ");
        hour = sc.nextInt();
        try {
            if (hour > 24 || hour < 0) {
                throw new HourException("Invalid Time!");
            } else {
                System.out.println("Valid Time Input!");
            }
        } catch (HourException err) {
            System.out.println(err.getMessage());
        }

    }

    public static void main(String[] args) {
        new TimeException().Input();
    }
}
