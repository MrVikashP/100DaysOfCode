package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        sortArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sortArr(int[] arr){
        if (arr.length == 0){
            return;
        }
        // counter each element
        for (int i = 0; i < arr.length; i++) {
            boolean isSorted = true;
            // for comparing the adjacent element
            for (int j = 1; j < arr.length-i; j++) {
                // if the next element is smaller than previous value
                if (arr[j] < arr[j-1]){
                    // swap the values
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;

                    // if any swap happens
                    isSorted = false;
                }
            }
            // if the array is sorted so just break the loop no need to check for the next element
            if (isSorted) break;
        }
    }
}
