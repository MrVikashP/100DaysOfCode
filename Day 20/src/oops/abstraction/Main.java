package oops.abstraction;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(10000);
        son.career();
        son.partner();

        Daughter daughter = new Daughter(20000);
        daughter.career();
        daughter.partner();

//        Parent parent = new Parent();
        // 'Parent' is abstract; cannot be instantiated

        Parent parent = new Son(10000);
        Parent.age = 20;
        System.out.println(parent.salary);
        Parent.message();
        parent.greet();
    }
}
