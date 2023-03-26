package revision.sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] nums = {3,5,1,2,4};

        sort(nums);

        System.out.println(Arrays.toString(nums));
    }

    static void sort(int[] arr){
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
