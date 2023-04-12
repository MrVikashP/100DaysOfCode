package array_problems;

public class FindFloor {
    // find floor of a number
    // floor number is the largest number <= target element
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,17,18};
        System.out.println(findFloor(arr,19));
    }

    static int findFloor(int[] arr, int target){
        // since the array is sorted we can apply binary search
        // if mid-element is equal to target then return the ans
        // if something smaller found than target then check on the right side to get the larger one than that
        // since we want to get the largest number <= target
        // if not find the target element then return the end when the condition fails

        int start = 0;
        int last = arr.length-1;

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

        return arr[last];
    }


}
