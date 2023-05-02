package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {22,5,3,-1,45,13,12};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void sort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (nums[j] > nums[j-1]) {
                    break;
                }

                int temp = nums[j];
                nums[j] = nums[j-1];
                nums[j-1] = temp;
            }
        }
    }
}
