package array_problems;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] nums = {22,12,-2,45,29};
        reverse(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void reverse(int[] nums){
        int start = 0;
        int end = nums.length-1;

        // swap
        while (start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
}
