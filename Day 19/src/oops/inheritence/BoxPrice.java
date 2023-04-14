package oops.inheritence;

public class BoxPrice extends BoxWeight{
    int price;

    public BoxPrice() {
        super(); // called one above parent class constructor - so it will call BoxWeight constructor not Box
        this.price = 100;
    }

    public BoxPrice(int length, int width, int height, int weight, int price) {
        super(length, width, height, weight);
        this.price = price;
    }
}
