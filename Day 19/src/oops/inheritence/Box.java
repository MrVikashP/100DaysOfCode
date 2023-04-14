package oops.inheritence;

public class Box {
    int length;
    int width;
    int height;

    public Box() {
        this.length = -1;
        this.height = -1;
        this.width = -1;
    }

    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box(int side) {
        this.length = side;
        this.height = side;
        this.width = side;
    }

    public Box(Box other) {
        this.length = other.length;
        this.width = other.width;
        this.height = other.height;

    }

    public static void greet() {
        System.out.println("Welcome");
    }
}
