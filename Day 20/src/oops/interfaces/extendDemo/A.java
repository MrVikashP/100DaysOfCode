package oops.interfaces.extendDemo;

public interface A {
    void greet();

    default void salary() {
        System.out.println("All good");
    }
}
