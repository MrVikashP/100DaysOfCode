package oops;

public class WrapperExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a,b);

        System.out.println(a + " " + b);

        // when want to treat a primitive data types as the classes then can do using wrapper class.
        Integer num1 = 10;
        Integer num2 = 20;
        swap2(num1,num2);

        System.out.println(num1 + " " + num2);

        // it gives access to different methods while primitive don't.

        A a1 = new A("Vikash");

        for (int i = 0; i < 100000000; i++) {
            a1 = new A("Vikash");

        }

    }

    // swap
    static void swap (int a, int b) {
        // primitive variables are stored in the stack and since in java methods arguments are pass by value not pass by reference.
        int temp = a;
        a = b;
        b = temp;

        // that is why swapping do not take place.
    }

    static void swap2(Integer a, Integer b) {
        // it is class but final so values can not be changes that is why swapping do not take place.
        Integer temp = a;
        a = b;
        b = temp;

    }

}

class A {
    String name;

    public A(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        // when the object is deleted what will happen
        System.out.println("Object is deleted");
    }
}
