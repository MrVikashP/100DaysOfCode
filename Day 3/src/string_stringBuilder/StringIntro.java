package string_stringBuilder;

import java.util.ArrayList;
import java.util.Arrays;

public class StringIntro {
    public static void main(String[] args) {
        // data_type ref_var = object_value
        String name = "vikash";
        System.out.println(name);

        String string = new String("vikash pandey");
        System.out.println(string);

        // comparison
        String n1 = "vik";
        String n2 = "vik";

        System.out.println(n1 == n2);
        System.out.println(n1.equals(n2));

        String n3 = new String("vik");
        String n4 = new String("vik");

        System.out.println(n3 == n4);
        System.out.println(n3.equals(n4));

        // output
        System.out.println(65);
        System.out.println("vikash");
        System.out.println(Arrays.toString(new int[]{1,2,3,4,5}));

        // pretty print
        System.out.printf("value is %.3f%n".formatted(34.65321116));
        System.out.printf("Pie is %.2f".formatted(Math.PI));

        // operators
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println("a" + 1);
        System.out.println('a' + 3);
        System.out.println(new Integer(46) + " " + new ArrayList<>());

        //performance
        String letters = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            // new object creation everytime
            letters += ch;
        }

        System.out.println(letters);

        //methods
        String money = " hundred fifty ";
        System.out.println(money.length());
        System.out.println(money.charAt(3));
        System.out.println(money.strip());
        System.out.println(Arrays.toString(money.split(" ")));

        // can explore different methods


    }
}
