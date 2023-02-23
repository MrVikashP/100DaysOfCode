package recursion_sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {8,3,4,12,5,6};
        sort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    static void sort(int[] arr, int low, int high){
        if (low >= high){
            return;
        }

        int s = low;
        int e = high;
        int pivot = s + (e - s) / 2;

        while (s <= e){
            // also a reason when array is already sorted it will not swap.
            while (arr[s] < arr[pivot]){
                s++;
            }

            while (arr[e] > arr[pivot]){
                e--;
            }

            if (s <= e){
                // swap two elements
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        // pivot will be at the correct index
        // first half would be from low to the index e
        sort(arr,low, e);
        sort(arr,s, high);

    }
}
