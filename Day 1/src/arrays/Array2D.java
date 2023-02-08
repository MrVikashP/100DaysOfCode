package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
       //initialization
        // datatype[][] var_name = new datatype[row][columns];
        // can also direct put the values without defining it.
        int[][] array = {
                {1,2,3},   // zero index
                {4,5,6,9,10},   // first index
                {7,8,9}    // second index
        };

        for (int row = 0; row < array.length; row++){
            // for each row, print the element according to its size.
            for (int col = 0; col < array[row].length; col++){
                System.out.print(array[row][col] + " ");
            }
            System.out.println();
        }


        // if we print array[2] -> [7,8,9];
        // System.out.println(array.length); - no of rows

        // input
        Scanner sc = new Scanner(System.in);
        int[][] array_2D = new int[3][3];

        for (int row = 0; row < array_2D.length; row++){
            for (int col = 0; col < array_2D[row].length; col++){
                array_2D[row][col] = sc.nextInt();
            }
        }

        // output
        // normal way
        for (int row = 0; row < array_2D.length; row++){
            for (int col = 0; col < array_2D[row].length; col++){
                System.out.print(array_2D[row][col] + " "); // print in same line
            }
            System.out.println(); // changing the line
        }

        // for each
        for (int[] val : array_2D){
            System.out.println(Arrays.toString(val));
        }
    }
}
