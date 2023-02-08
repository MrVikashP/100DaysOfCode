package sorting;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        // values in the arrays are in the range 1 - n
        int[] arr = {3,5,1,2,4};
        sortArr(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sortArr(int[] arr){
        int i = 0;
        // counter loop
        while (i < arr.length) {
            // find right Index
            int rightIndex = arr[i] - 1;
            // check whether the value is placed at right index or not
            // if placed at right index then increment the i
            // if not repeat the steps of swapping and get the results.
            if (rightIndex != i){
                int temp = arr[i];
                arr[i] = arr[rightIndex];
                arr[rightIndex] = temp;
            }
            else i++;
        }

    }
}
