package recursion.arrays;

import java.util.Arrays;

public class IsSorted {
    public static void main(String[] args) {
        int[] nums = {2,3,4,10,6,7};

        System.out.println(isSorted(nums));

        System.out.println(isSorted2(nums, 0));
    }

    static boolean isSorted(int[] nums){
        if (nums.length == 1){
            return true;
        }

        return nums[0] < nums[1] && isSorted(Arrays.copyOfRange(nums,1,nums.length));
    }

    static boolean isSorted2(int[] nums, int index) {
        if (index == nums.length - 1){
            return true;
        }

        return nums[index] < nums[index+1] && isSorted2(nums, index + 1);
    }
}
