package revision.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {67,34,12,0,46,90,-23,77};

        sort(nums);

        System.out.println(Arrays.toString(nums));
    }

    static void sort(int[] nums) {
        // first find max and then place it at the rightmost index

        for (int i = 0; i < nums.length; i++) {

            int lastIndex = nums.length - 1 - i;

            int maxIndex = getIndex(nums,lastIndex);

            // swaps
            int temp = nums[lastIndex];
            nums[lastIndex] = nums[maxIndex];
            nums[maxIndex] = temp;
        }
    }

    static int getIndex(int[] nums, int e) {
        int index = -1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= e; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }

        return index;
    }
}
