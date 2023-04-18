package oops.lamdaExpression;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(60);
        arrayList.add(70);

//        arrayList.forEach((item) -> System.out.println(item * 2));

        Consumer<Integer> fun = (item) -> System.out.println(item * 2);
        arrayList.forEach(fun);

        Operation sum = (a,b) -> a + b;
        Operation prod = (a,b) -> a*b;

        Main calculator = new Main();
        System.out.println(calculator.doOperation(30,40,sum));
        System.out.println(calculator.doOperation(40,2,prod));


    }

    private int doOperation(int a, int b, Operation op) {
        return op.operation(a,b);
    }
}

interface Operation {
    int operation(int a, int b);
}
