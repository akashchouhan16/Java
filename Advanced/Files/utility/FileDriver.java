package Files.utility;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

// To control all the operations [Create, Read, Write, Delete]
public class FileDriver {
    public static String absolutePath = "C:\\Users\\KIIT\\Desktop\\Dev\\JAVA\\Advanced\\Files";
    public static Scanner sc = new Scanner(System.in);

    public FileDriver() {
        int ch;
        System.out.println("Do you want to update the default filepath? (1/0) : ");
        ch = sc.nextInt();
        if (ch == 1) {
            System.out.println("Enter the full filepath / Directory path : ");
            String preventBuffer = sc.next();
            absolutePath = sc.nextLine();
        } else {
            System.out.println("Using the Default Path : " + absolutePath);
        }
    }

public  void DisplayMenu() {

    System.out.println("~~ File Read/Write ~~");
    System.out.println("Enter 1 to open file\nEnter 2 to Write to OpenFile\nEnter 3 to Read from
File\nEnter 4 to Delete the File\nEnter 0 to exit().");
 do {
    System.out.println("Enter the Choice : ");
    int choice = sc.nextInt();

  switch (choice) {
    case 0:
        System.out.print("Terminating....");
        System.exit(0);
        break;
    case 1:
        CreateFile();
        break;
    case 2:
        WriteToFile();
        break;
    case 3:
        ReadFromFile();
        break;
    case 4:
        DeleteFile();
            break;
    default:
    System.out.println("Invalid Choice! TRY Again");
    }
 } while (true);
}

    // FileDriver API

    public void CreateFile() {
        // Creating a File using the File object.
        try {
            File newFile = new File(absolutePath + "\\NewFile.txt");
            newFile.createNewFile();
        } catch (IOException exp) {
            System.out.println("Unable to create the file....");
            exp.printStackTrace();
        }
        System.out.println("File has been Created...\n");
        return;
    }

    public void WriteToFile() {
        System.out.println("Enter the content : ");
        String buffer = sc.next(); // Prevent Buffer error.
        String content = sc.nextLine();

        // Writing to the file
        try {
            FileWriter fileWriter = new FileWriter(absolutePath + "\\NewFile.txt");
            fileWriter.write(content);
            fileWriter.close();
        } catch (IOException exp) {
            System.out.println("Unable to write to File... :/");
            exp.printStackTrace();
        } finally {
            System.out.println("File has been updated with the input content...");
        }
        return;
    }

    public void ReadFromFile() {
        // Reading a File content.
        System.out.println("Enter the File name.ext to view its contents : ");
        String buffer = sc.next(); // Prevent Buffer error.
        String FileName = sc.nextLine();
        try {
            File reader = new File(absolutePath + "\\NewFile.txt");
            Scanner newSc = new Scanner(reader);
            String line = sc.nextLine();
            System.out.println(line);
            while (newSc.hasNextLine()) {
                line = sc.nextLine();
                System.out.println(line);
            }
            newSc.close();

        } catch (FileNotFoundException exp) {
            System.out.println("File not Found in the Sub-directory : " + absolutePath);
            exp.printStackTrace();
        } catch (Exception exp) {
            System.err.println("Something went wrong while reading from the File : " + absolutePath + "\\" + FileName);
            exp.printStackTrace();
        }
        return;
    }

public boolean DeleteFile() {
    System.out.print("Enter the File to Delete : ");
    String buffer = sc.next(); // Prevent Buffer error.
    String fileName = sc.nextLine();
    File myFile = new File(absolutePath + "\\" + fileName);
    if (myFile.delete()) {
        System.out.println("File Delete Successful : " + myFile.getName() + "
        Deleted!");
    } else {
        System.out.println("ERROR : Unable to Delete the File.");
        return false;
    }
    return true;
}

};