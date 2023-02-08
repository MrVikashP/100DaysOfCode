package searching.binary_search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-2,10,45,90};
        System.out.println(findTarget(nums,95));
    }

    static int findTarget(int[] nums, int target){
        int start = 0;
        int last = nums.length-1;

        while (start <= last) {
            // find mid element
            int mid = start + (last - start) / 2;

            // if mid element equals target
            if (nums[mid] == target){
                return mid;
            }

            // if mid element greater than target means target lies before the mid i.e start - mid range so last will be mid
            else if (nums[mid] > target){
                last = mid;
            }

            // if mid element smaller than target means target lies before the mid i.e mid - last range so start will be mid + 1
            else {
                start = mid + 1;
            }
        }

        return -1;
    }
}
