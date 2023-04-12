package array_problems;

public class FindCeiling {
    // find ceiling of a number
    // ceiling number is the smallest number >= Target Element
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        System.out.println(findCeiling(arr,1));
    }

    static int findCeiling (int[] arr, int target){
        // since the array is sorted we can apply binary search
        // if mid-element is equal to target then return the ans
        // if something greater found than target then check on the left side to get the smaller one than that
        // since we want to get the smallest number >= target
        // if not find the target element then return the start when the condition fails

        int start = 0;
        int last = arr.length-1;

        if (target > arr[last]){
            return -1;
        }

        while (start <= last){
            int mid = start + (last - start) / 2;

            if (arr[mid] == target){
                return target;
            }
            else if (arr[mid] > target){
                last = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return arr[start];
    }
}
