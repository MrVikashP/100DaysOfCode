package oops.abstraction;

public class Daughter extends Parent {

    public Daughter(int salary) {
        super(salary);
    }

    @Override
    void career() {
        System.out.println("Want to become Doctor");
    }

    @Override
    void partner() {
        System.out.println("Kamaane wala");

    }
}
