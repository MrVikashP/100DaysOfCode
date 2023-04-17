package oops.abstraction;

public class Son extends Parent {
    public Son(int salary) {
        super(salary);
    }

    @Override
    void career() {
        System.out.println("Want to become Engineer");
    }

    @Override
    void partner() {
        System.out.println("Sundar-Sushil");
    }
}
