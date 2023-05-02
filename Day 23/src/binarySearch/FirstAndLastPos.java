package binarySearch;

import java.util.Arrays;

public class FirstAndLastPos {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};

        int target = 7;

        System.out.println(Arrays.toString(getFirstAndLastIndex(nums, target)));
    }

    static int[] getFirstAndLastIndex(int[] nums, int target) {
        int[] ans = {-1,-1};

        ans[0] = getIndexValue(nums, target, true);

        if (ans[0] != -1){
            ans[1] = getIndexValue(nums,target,false);
        }

        return ans;
    }

    static int getIndexValue(int[] nums, int target, boolean isFirst) {
        int result = -1;

        int s = 0;
        int e = nums.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (target > nums[mid]) {
                s = mid + 1;
            }

            else if (target < nums[mid]) {
                e = mid - 1;
            }

            else {
                result = mid;

                if (isFirst) {
                    e = mid - 1;
                }

                else s = mid + 1;
            }
        }

        return result;
    }
}
