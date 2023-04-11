package oops.staticTalks;

public class StaticBlocks {
    private static int a = 5;
    private static int b;

    // it runs once.
    static {
        System.out.println("I am in a static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlocks blocks = new StaticBlocks();

        System.out.println(StaticBlocks.a + " " + StaticBlocks.b);

        StaticBlocks.b += 5;

        System.out.println(StaticBlocks.a + " " + StaticBlocks.b);

        StaticBlocks blocks2 = new StaticBlocks();
        System.out.println(StaticBlocks.a + " " + StaticBlocks.b);


    }

}
