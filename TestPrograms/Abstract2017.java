import java.util.Scanner;

abstract class Shapes {
    Shapes() {
        System.out.println("Abstract Class Constructor Called!");
    }

    abstract void volume(); // Abstract Method.
}

class Sphere extends Shapes {
    float radius;
    float PI = 3.1412f;
    static Scanner sc = new Scanner(System.in);

    public Sphere() {
        System.out.println("Sphere Invoked!");
        System.out.print("Enter the Sphere Radius : ");
        this.radius = sc.nextFloat();
    }

    @Override
    void volume() {
        double result = (((float) 4 / (float) 3) * PI * (float) Math.pow(radius, 3));
        System.out.println("Volume of the Sphere : " + result);
        return;
    }

}

public class Abstract2017 {
    public static void main(String[] args) {
        Sphere object = new Sphere();
        object.volume();

        return;
    }
}
