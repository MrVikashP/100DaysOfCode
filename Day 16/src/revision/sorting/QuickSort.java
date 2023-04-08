package revision.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {78,89,4,5,6,17,11,-23,-98,39,23,27};
        sort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));

    }

    static void sort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }

        int s = low;
        int e = high;

        int mid = s + (e - s) / 2;

        int pivot = nums[mid];

        while (s < e) {
            while (nums[s] < pivot) {
                s++;
            }

            while (nums[e] > pivot) {
                e--;
            }

            // swap
            if (s < e) {
                int temp = nums[e];
                nums[e] = nums[s];
                nums[s] = temp;
                s++;
                e--;
            }
        }

        sort(nums, low, mid);
        sort(nums,mid+1, high);
    }
}
