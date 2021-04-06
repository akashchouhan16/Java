import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class testWrite {
    static Scanner sc = new Scanner(System.in);
    String data;

    public static void main(String[] args) throws IOException {
        System.out.println("Enter the File Content : ");
        testWrite obj = new testWrite();
        obj.data = sc.nextLine();

        try {
            FileOutputStream fout = new FileOutputStream(
                    "C:\\Users\\KIIT\\Desktop\\Dev\\JAVA\\FileHandling\\test2.txt");
            byte b[] = obj.data.getBytes(); // Convert to bytes.
            fout.write(b);
            fout.close();
            System.out.println("Write Success....!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
