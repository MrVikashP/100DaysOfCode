package revision.searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6,7,8,9,12,15};
        int target = 12;

        System.out.println(getTargetIndex(nums, target));
    }

    static int getTargetIndex(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            // find mid
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                // if target is smaller search in the first half
                end = mid;
            }

            else if (target > nums[mid]) {
                // if target is large then search in the second half
                start = mid + 1;
            }

            // nums[mid] == targets
            else return mid;
        }

        return -1;
    }
}
