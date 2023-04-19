package leetcode;

import java.util.Arrays;

// https://leetcode.com/problems/move-zeroes/
public class Question1 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,0,4,0,0,9,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));

    }

    public static void moveZeroes(int[] nums) {
        // Type 1
//        int index = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != 0) {
//                nums[index++] = nums[i];
//            }
//        }
//
//        while (index < nums.length) {
//            nums[index++] = 0;
//        }

        // Type 2
        int lastNonZeroFoundAt = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[lastNonZeroFoundAt];
                nums[lastNonZeroFoundAt] = temp;

                lastNonZeroFoundAt++;
            }
        }
    }

}
