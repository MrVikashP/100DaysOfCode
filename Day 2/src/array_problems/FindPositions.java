package array_problems;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class FindPositions {
    public int[] searchRange(int[] nums, int target){
        int[] res = {-1,-1};

        if (target > nums[nums.length-1] || target < nums[0]){
            return res;
        }

        res[0] = searchTarget(nums, target, true);
        if (res[0] != -1){
            res[1] = searchTarget(nums,target,false);
        }

        return res;
    }

    static int searchTarget(int[] nums, int target, boolean firstOccurence){
        int index = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (nums[mid] > target){
                end = mid - 1;
            }
            else if (nums[mid] < target){
                start = mid + 1;
            }
            else {
                index = mid;
                if (firstOccurence){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return index;
    }

}
