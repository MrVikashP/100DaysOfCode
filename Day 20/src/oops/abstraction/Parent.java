package oops.abstraction;

public abstract class Parent {
    int salary;
    static int age;

    final int insurance;

    void greet() {
        System.out.println("Greets");
    }

    static void message() {
        System.out.println("You are doing good");
    }

    public Parent(int salary) {
        this.salary = salary;
        this.insurance = 100000;
    }


    abstract void career();
    abstract void partner();
}
