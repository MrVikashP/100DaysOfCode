package recursion_problems.arrays;

import java.lang.annotation.Target;

public class RotatedSorted {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,1,2,3};
        System.out.println(searchTarget(arr, 2, 0, arr.length - 1));
    }
    static int searchTarget(int[] arr, int target, int start, int end){
        if (start > end) {
            return -1;
        }

        // find mid
        int mid = start + (end - start) / 2;

        // case 1
        if (arr[mid] == target) {
            return mid;
        }

        // case 2
        if (arr[start] <= arr[mid]){
            if (target >= arr[start] && target <= arr[mid]){
                return searchTarget(arr, target, start, mid );
            }
            else return searchTarget(arr, target, mid + 1, end);
        }

        // case 3
        if (target > arr[mid] && target < arr[end]){
            return searchTarget(arr, target, mid + 1, end);
        }

        //case 4
        return searchTarget(arr, target, start, mid );
    }
}
