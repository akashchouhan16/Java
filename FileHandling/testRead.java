import java.io.FileInputStream;
import java.io.IOException;

public class testRead {
    public static void main(String[] args) throws IOException {
        try {
            FileInputStream fin = new FileInputStream("C:\\Users\\KIIT\\Desktop\\Dev\\JAVA\\FileHandling\\test.txt");
            int i = 0;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }

            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
