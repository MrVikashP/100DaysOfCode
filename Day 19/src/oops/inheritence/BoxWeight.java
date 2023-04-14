package oops.inheritence;

public class BoxWeight extends Box{
    int weight;

    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(int length, int width, int height, int weight) {
        super(length, width, height); // calling parent constructor
        this.weight = weight;
    }

    public BoxWeight(BoxWeight other) {
        super(other);
        this.weight = other.weight;
    }

    public BoxWeight(int side, int weight) {
        super(side);
        this.weight = weight;
    }
}

