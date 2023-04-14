package oops.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Square square = new Square();

        shape.area();
        circle.area();
        square.area();

        Shape shape1 = new Circle();
        // so type of reference variable determines what to access but object tells us that which one to access
        // that is why we can access area but that which is in the Circle because object is of type Circle
        // so when the Circle object is created, area method will be overridden since it present in parent with its own features
        shape1.area();
    }
}
