package revision.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {78,89,4,5,6,17,11,-23,-98,39,23,27};

        int[] ans = sort(nums);

        System.out.println(Arrays.toString(ans));

        sortInPlace(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    static int[] sort(int[] nums) {
        if (nums.length == 1){
            return nums;
        }

        int mid = nums.length / 2;

        int[] left = sort(Arrays.copyOfRange(nums, 0, mid));
        int[] right = sort(Arrays.copyOfRange(nums, mid, nums.length));

        return mergeAll(left,right);
    }

    static int[] mergeAll(int[] left, int[] right) {
        int[] ans = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                ans[k++] = left[i];
                i++;
            }

            else {
                ans[k++] = right[j];
                j++;
            }
        }

        while (i < left.length) {
            ans[k++] = left[i++];
        }

        while (j < right.length) {
            ans[k++] = right[j++];
        }

        return ans;
    }

    static void sortInPlace(int[] nums, int start, int end) {
        if (start == end){
            return;
        }

        int mid = (start + end) / 2;

        sortInPlace(nums, start, mid);
        sortInPlace(nums, mid + 1, end);

        mergeInPlace(nums, start, end, mid);
    }

    static void mergeInPlace(int[] nums, int start, int end, int mid) {
        int[] mix = new int[end - start + 1];

        int i = start;
        int j = mid + 1;
        int k = 0;

        while (i <= mid  && j <= end) {
            if (nums[i] < nums[j]) {
                mix[k++] = nums[i++];
            }

            else {
                mix[k++] = nums[j++];
            }
        }

        while (i <= mid) {
            mix[k++] = nums[i++];
        }

        while (j <= end) {
            mix[k++] = nums[j++];
        }

        for (int l = 0; l < mix.length; l++) {
            nums[start + l] = mix[l];
        }
    }
}
