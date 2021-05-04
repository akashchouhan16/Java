public class output {
    static int j;

    static void methodA(int i) {
        boolean b;
        do {
            b = i < 10 | methodB(4);
            b = i < 10 || methodB(8);
        } while (!b);
    }

    static boolean methodB(int i) {
        j += i;
        return true;
    }

    public static void main(String[] args) {
        methodA(0);
        int z[][] = { { 1, 2, 3, 4 }, { 1, 2, 3 } };
        System.out.println(z[1].length + " " + z.length);
        System.out.println(j);
    }
}
