import java.util.Scanner;

public class Findminimum {
    static Scanner sc = new Scanner(System.in);
    static int MAXSIZE = 10;
    int arr[] = new int[MAXSIZE];

    Findminimum() {
        for (int i = 0; i < MAXSIZE; i++)
            arr[i] = 0;
    }

    void Input() {
        System.out.println("Enter Array Element : ");
        for (int i = 0; i < MAXSIZE; i++) {
            arr[i] = sc.nextInt();
        }
        return;
    }

    void Display() {
        for (int i = 0; i < MAXSIZE; i++)
            System.out.print(arr[i] + " ");
        return;
    }

    void BubbleSort() {
        int i, j;
        boolean flag = false;
        for (i = 0; i < MAXSIZE - 1; i++) {
            flag = false;
            for (j = 0; j < MAXSIZE - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
        System.out.println("Array Sorted!");
        return;
    }

    public static void main(String[] args) {
        Findminimum obj = new Findminimum();
        obj.Input();
        System.out.print("INPUT Array : ");
        obj.Display();
        obj.BubbleSort();
        System.out.print("OUTPUT Array : ");
        obj.Display();
    }
};
