package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array1D {
    public static void main(String[] args) {
        int[] roll = new int[5];
        // since the indices starts from zero so length will be size-1
        // putting values
        roll[0] = 46;
        roll[2] = 11;

        System.out.println(roll[0]); // print 46
        System.out.println(roll[1]); // print 0
        // System.out.println(roll[negative or more than length]) - out of bound error;

        // if like there is size of 100, putting values like above is not a good way of doing
        // may use for loop to get values at ones at put it in the array according to index.

        Scanner sc = new Scanner(System.in);
        int[] id = new int[5];
        for (int i = 0; i < id.length; i++) {
            id[i] = sc.nextInt();
        }

        // output
        // normal way
        for (int i = 0; i < id.length; i++) {
            System.out.print(id[i] + " "); // printing value of each index
        }

        // using for each
        for (int num : id){ // num is denoting the element of the array
            System.out.print(num + " "); // printing the element
        }

        // using inbuilt methods
        System.out.println(Arrays.toString(id));

        // array of objects
        String[] s = new String[5];
        for (int i = 0; i < s.length; i++) {
            s[i] = sc.next();
        }

        // output
        // can print in different ways as above

        System.out.println(Arrays.toString(s));

        // for arrays of objects is a collection of references which is pointing
        // to the objects which can be located anywhere in the heap

    }
}
