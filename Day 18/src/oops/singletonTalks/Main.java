package oops.singletonTalks;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();

        // only one instance is created for every object creation

        System.out.println(singleton == singleton1); // print true since object reference is same for each.
    }
}
