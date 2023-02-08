package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {7,9,2,4,1,-6,-28,8,0};
        sortArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sortArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            // important to find last index for each pass to ignore the unnecessary comparisons
            // get max in the array and place it at the right place
            int last = arr.length - i - 1;
            int maxIndex = findMax(arr,0, last);

            // swap for setting up the right positions.
            int temp = arr[last];
            arr[last] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }

    static int findMax(int[] arr, int start, int last){
        int max = start;
        for (int i = start; i <= last; i++) {
            if (arr[i] > arr[max]){
                max = i;
            }
        }

        return max;
    }
}
