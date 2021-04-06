public class commandLineOne {
    public static void main(String[] args) {
        System.out.println("Command Line Output : ");
        for (int i = 0; i < args.length; i++)
            System.out.println(args[i] + ", ");
    }
}
