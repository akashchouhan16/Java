import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// import jdk.internal.org.jline.utils.InputStreamReader;

public class TestBuffer {
    String userName;
    int userID;

    TestBuffer() {
        userName = "Not Provided!";
        userID = 0000;
    }

    TestBuffer(String userName, int userId) {
        this();
        this.userID = userId;
        this.userName = userName;
    }

    void Display() {
        System.out.println("User Name : @" + this.userName + "\nUser ID : #" + this.userID);
        return;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter User Name : ");
        String name = reader.readLine();
        System.out.print("Enter User ID : ");
        int ID = Integer.parseInt(reader.readLine());
        TestBuffer test = new TestBuffer(name, ID);
        test.Display();

    }
}
