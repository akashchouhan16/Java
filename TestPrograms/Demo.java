// Q5a On Java Interfaces
/*
 a. Interface methods are static and public and must be defined by a class that implements it.
 b. Interface methods can have a body if it is declared as a default method. and in that case even if it is not overwritten by the class implementing it, it will not throw an error.
 c. Interfaces can also have data attributes that are Final in nature and static and hence we can directly access them inside the class that implements it without creating an intance of the interface.
*/
interface Number {
    int x = 1; // public static and final
    int y = 1;

    int process(int x, int y);
};

class Sum implements Number {
    @Override
    public int process(int x, int y) {
        System.out.println("Sum::Process() override invoked!");
        return (x + y);
    }
}

class Average implements Number {
    @Override
    public int process(int x, int y) {
        System.out.println("Average::Process() override invoked!");
        int result = (x != 0) ? x / y : y / x;
        return result;
    }
}

public class Demo {
    public static void main(String[] args) {
        // Testing the above two classes.
        Sum object1 = new Sum();
        int output = object1.process(150, 50);
        System.out.println("1. Value : " + output);
        Average object2 = new Average();
        output = object2.process(200, 30);
        System.out.println("2. Value : " + output);
    }
}
