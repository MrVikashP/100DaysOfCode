package arrays;


import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist1D {
    public static void main(String[] args) {
        // initialization
        // 1. <data type, but it can only be a class not as primitive> 2. (for defining initial capacity if you want)
        ArrayList<Integer> al = new ArrayList<>(5);

        // when we do al. then we get to know different methods that pop up and can use accordingly
        // add() to add elements
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(60);
        al.add(70);
        al.add(90);

        System.out.println(al);
        al.get(3);    // used to get value at that particular index
        al.set(0,29); // used to set values at that index
        al.size();    // print the size of the list
        al.contains(40); // used to check whether the value is present or not.
        al.indexOf(60); // can get the index of particular values
        al.remove(2); // can remove element at that index
        // there are different methods are there, use them accordingly

        // input
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            al.add(sc.nextInt());
        }

        System.out.println(al);
    }
}
