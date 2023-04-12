package recursion_sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {8,3,4,12,5,6};
        System.out.println(Arrays.toString(sort(arr)));
        sortInPlace(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    static int[] sort(int[] arr){
        // base condition
        // when only one element left return it
        if (arr.length == 1){
            return arr;
        }

        // find mid to divide
        int mid = arr.length / 2;

        // making a copy of the array of different sizes according to need
        int[] left_part = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right_part = sort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left_part, right_part);

    }

    // merge both halves and return to where was called
    static int[] merge(int[] left_part, int[] right_part){
        // creating a new array for storing the sorted elements
        int[] ans = new int[left_part.length + right_part.length];
        // start checking from the start of the both the arrays and with comparison among them
        // add the smaller in the ans array by initializing the index of it.
        // startLeft, startRight, index
        int sl = 0, sr = 0, index = 0;

        // run till both array have elements to compare to fit place in the ans array
        while (sl < left_part.length && sr < right_part.length) {
            // if element at startLeft < if element at startRight
            // add the smaller element in the ans array first then fills the remaining ones
            // increase the count of the array having the smaller element
            if (left_part[sl] <= right_part[sr]){
                ans[index++] = left_part[sl];
                sl++;
            }
            // if element at startRight < if element at startLeft
            // add the smaller element in the ans array first then fills the remaining ones
            // increase the count of the array having the smaller element
            else {
                ans[index++] = right_part[sr];
                sr++;
            }
        }

        // if any of the above start in left part or right part reaches its limit
        // then just add those elements directly to the ans array

        // if left part do not get emptied
        while (sl < left_part.length){
            ans[index++] = left_part[sl];
            sl++;
        }

        // if right part do not get emptied
        while (sr < right_part.length){
            ans[index++] = right_part[sr];
            sr++;
        }

        // return the ans array
        return ans;
    }

    static void sortInPlace(int[] arr, int start, int end){
        // base condition
        // if single element left return the array
        if (start == end){
            return;
        }

        // find mid
        int mid = start + (end - start) / 2;

        // instead of making array copy, pass the range of index
        sortInPlace(arr, start, mid);
        sortInPlace(arr, mid + 1, end);

        mergeInPlace(arr, start, mid, end);
    }

    static void mergeInPlace(int[] arr, int start, int mid, int end){
        int[] mix = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;

        // run till both array have elements to compare to fit place in the ans array
        while (i <= mid && j <= end) {
            // add the smaller element in the ans array first then fills the remaining ones
            // increase the count of the array having the smaller element
            if (arr[i] <= arr[j]){
                mix[k] = arr[i];
                i++;
            }

            // add the smaller element in the ans array first then fills the remaining ones
            // increase the count of the array having the smaller element
            else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        // if left part do not get emptied
        while (i <= mid){
            mix[k] = arr[i];
            k++;
            i++;
        }

        // if right part do not get emptied
        while (j <= end){
            mix[k] = arr[j];
            k++;
            j++;
        }

        // changing the original array
        for (int l = 0; l < mix.length; l++) {
            arr[start+l] = mix[l];
        }

    }

}
