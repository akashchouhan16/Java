
interface WaterBottleInterFace {
    String color = "Navy Blue";
    int unitsOfWater = 1;

    void fillBottle();

    void emptyBottle();
}

public class InterfaceEmp1 implements WaterBottleInterFace {
    public static void main(String[] args) {
        System.out.println(color);
        InterfaceEmp1 obj = new InterfaceEmp1();
        obj.fillBottle();
    }

    @Override
    public void fillBottle() {
        // unitsOfWater += 1;
        System.out.println("Water Bottle is emptied : " + unitsOfWater);
    }

    @Override
    public void emptyBottle() {
        // unitsOfWater -= 1;
        System.out.println("Water Bottle is Filled : " + unitsOfWater);
    }
}