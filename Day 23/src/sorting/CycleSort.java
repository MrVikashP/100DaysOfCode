package sorting;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] nums = {2,5,1,4,3};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void sort(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            int rightIndex = nums[i] - 1;

            if (i != rightIndex) {
                int temp = nums[i];
                nums[i] = nums[rightIndex];
                nums[rightIndex] = temp;
            }

            else i++;
        }
    }
}
