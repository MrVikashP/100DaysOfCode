package revision.searching;

public class CeilingElement {
    // ceiling is the smallest number that is greater or equal to target
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,7,8,9};
        int target = 6;

        System.out.println(findResult(nums, target));
    }

    static int findResult(int[] nums, int target) {
        if (target > nums[nums.length - 1]) {
            return -1;
        }
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            else if (target < nums[mid]) {
                end = mid - 1;
            }

            else start = mid + 1;
        }

        return start;
    }
}
