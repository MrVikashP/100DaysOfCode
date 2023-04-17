package oops.interfaces.nested;

public class A {
    public interface B {
        boolean isOdd(int num);

    }
}

class C implements A.B {

    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}
