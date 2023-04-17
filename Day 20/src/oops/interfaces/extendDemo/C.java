package oops.interfaces.extendDemo;

public class C implements B{


    @Override
    public void message() {

    }

    @Override
    public void greet() {

    }

    @Override
    public void foodChoice() {

    }

//    public void salary() {
//        System.out.println("Nothing good");
//    }

    public static void main(String[] args) {
        C c = new C();
        c.salary();
    }
}
