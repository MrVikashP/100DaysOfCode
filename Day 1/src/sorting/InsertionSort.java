package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1,9,-3,5};
        sortArr(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sortArr(int[] arr){
        // counter loop till size - 1 since every pass the sorting takes place and inner loop checks till size.
        for (int i = 0; i < arr.length-1; i++) {
            // inner loop responsible for sorting till the particular index
            for (int j = i + 1; j > 0 ; j--) {
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                // if the previous values is smaller than the current one then break the loop no need to check more,
                // since the array is sorted and moving ahead by doing the same.
                else break;
            }
        }
    }
}
