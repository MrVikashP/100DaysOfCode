package arrays;

import java.util.ArrayList;
import java.util.Scanner;


public class Arraylist2D {
    public static void main(String[] args) {
        // initialization
        // <here will define the arraylist instead of wrapper classes>

        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        // define no of arraylist that will contain at the start.
        // if you do not initialize it then by default it will be null and cannot add values in the null, so it will show error
        for (int i = 0; i < 3; i++) {
            arrayLists.add(new ArrayList<>());
        }

        // taking input
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arrayLists.get(i).add(sc.nextInt());
            }
        }

        System.out.println(arrayLists);
    }
}
