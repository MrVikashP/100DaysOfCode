package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {22,5,3,-1,45,13,12};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int last = nums.length - i - 1;
            int maxIndex = 0;
            for (int j = 0; j <= last; j++) {
                if (nums[maxIndex] < nums[j]){
                    maxIndex = j;
                }
            }
            // swap
            int temp = nums[last];
            nums[last] = nums[maxIndex];
            nums[maxIndex] = temp;
        }
    }
}
