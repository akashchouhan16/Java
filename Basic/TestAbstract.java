import java.util.Scanner;

abstract class Shapes {
    protected int perimeter;
    protected float area;
    // Parameters
    protected int sideA;
    protected int sideB;
    protected float radius;

    Shapes() {
        this.area = 0.0f;
        this.perimeter = 0;
    }

    Shapes(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    Shapes(float radius) {
        this.radius = radius;
    }

    abstract void ComputeArea();

    abstract void ComputePerimeter();
};

class Rectangle extends Shapes {
    private int length;
    private int breadth;
    static Scanner sc = new Scanner(System.in);

    Rectangle() {
        super();
        System.out.println("Enter the Dimensions of the Rect : ");
        this.length = sideA = sc.nextInt();
        this.breadth = sideB = sc.nextInt();
    }

    @Override
    void ComputeArea() {
        area = (float) sideA * (float) sideB;
        System.out.println("Area of the Rectangle : " + area);
        return;
    }

    @Override
    void ComputePerimeter() {
        perimeter = 2 * sideA + 2 * sideB;
        System.out.println("Perimeter of the Rectangle : " + perimeter);
        return;
    }
};

class Circle extends Shapes {
    private float rad = 0.0f;
    static Scanner sc = new Scanner(System.in);

    Circle() {
        super();
        System.out.println("Enter the Radius of the Circle : ");
        this.rad = radius = sc.nextFloat();

    }

    @Override
    public void ComputeArea() {
        this.area = 2 * (3.1412f) * this.radius;
        System.out.println("Area of the Circle : " + this.area);
        return;
    }

    @Override
    public void ComputePerimeter() {
        this.perimeter = (int) (2 * (3.1412) * this.radius);
        System.out.println("Perimeter of the Circle : " + this.perimeter);
        return;
    }
};

public class TestAbstract {
    public static void main(String[] args) {
        int choice;
        System.out.printf("Enter 1 for Rectangle\nEnter 2 for Circle \nEnter 0 to exit().\n");
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter Choice : ");
            choice = sc.nextInt();

            switch (choice) {
            case 0:
                System.out.println("Terminating.....");
                System.exit(0);
                break; // redundant.
            case 1:
                Rectangle object = new Rectangle();
                object.ComputeArea();
                object.ComputePerimeter();
                break;
            case 2:
                Circle Object = new Circle();
                Object.ComputeArea();
                Object.ComputePerimeter();
                break;

            default:
                System.out.println("Invalid Choice....\nTRY AGAIN!");
                break;
            }
        } while (true);

    }
}
