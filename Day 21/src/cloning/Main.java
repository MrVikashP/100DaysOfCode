package cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human vikash = new Human("vikash",23);

//        Human ram = new Human(vikash);
        Human ram = vikash.clone();
        System.out.println(ram);
        System.out.println(Arrays.toString(ram.arr));

        ram.arr[0] = 100;
        System.out.println(Arrays.toString(vikash.arr));
    }
}
