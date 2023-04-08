package revision.recursion;


public class IsSorted {
    public static void main(String[] args) {
        int[] nums = {2,3,9,5,7};
        System.out.println(getResult(nums));
    }

    static boolean getResult(int[] nums) {
        return helper(nums, 0);
    }

    private static boolean helper(int[] nums, int i) {
        if (i == nums.length - 1) {
            return true;
        }

        return nums[i] < nums[i + 1] && helper(nums, i + 1);
    }
}
