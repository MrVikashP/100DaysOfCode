package oops.inheritence;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(2,3,4);
        Box box1 = new Box(box);

        System.out.println(box1.length + " " + box1.width + " " + box1.height);

        BoxWeight boxWeight = new BoxWeight(20,30,40, 20);
        System.out.println(boxWeight.width);

        Box box2 = new BoxWeight(23,4);
        // here reference type is Box but the object is of type BoxWeight
        // Important note is that it is type of the reference which determines what to access not the object.
        // so since it is type of box we can access all the properties that is defined in the Box class.
        // cannot access those which depends solely on the object will show error.
        System.out.println(box2.width);

//        BoxWeight boxWeight = new Box();
        // will give error because it is discussed that it type of reference that determines the properties to be accessed
        // since type is of boxWeight so can access weight too
        // for accessing those one should initialize that too.
        // since object is of type Box type which is the parent class which do not anything about child class
        // it is not able to initialize then error will be there
        // so reference variable cannot be of child type when the object is of type Parent

        BoxPrice boxPrice = new BoxPrice();

        System.out.println(boxPrice.weight);
        System.out.println(boxPrice.length);
        System.out.println(boxPrice.price);
//        boxPrice.greet(); static methods can be inherited.



    }
}
