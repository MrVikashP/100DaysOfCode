package revision.sorting;

import java.util.Arrays;

public class BubbleSort {
    // it is also called sinking sort or exchange sort
    // it maintains the order, so it is stable sorting algo
    public static void main(String[] args) {
        int[] nums = {67,34,12,0,46,90,-23,77};

        sort(nums);

        System.out.println(Arrays.toString(nums));
    }

    static void sort(int[] nums) {
        // comparing the adjacent element, with every pass max will be at the last and the process continues
        for (int i = 0; i < nums.length ; i++) {
            // if in any pass no swapping happens break the loop;
            boolean isSwapped = false;
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j] < nums[j - 1]) {
                    // swaps
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;

                    isSwapped = true;
                }

            }

            if (!isSwapped) {
                break;
            }
        }
        
    }
}
