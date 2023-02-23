package array_problems;

// https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {5,6};
        int target = 3;
        int res = search(arr, target);
        System.out.println(res);
    }
    static int search(int[] nums, int target) {
        // rotation of array means last element comes at first and repeats further for another rotation
        // pivot is something where order disrupts means max in the array
        int pivot = getPivot(nums);
        if (pivot == -1){
            return getTarget(nums, target, 0, nums.length-1);
        }

        int index = getTarget(nums, target, 0, pivot);
        if (index != -1){
            return index;
        }

        else return getTarget(nums, target, pivot + 1, nums.length - 1);
    }
    static int getPivot(int[] nums){
        int start = 0;
        int last = nums.length - 1;

        while (start < last){
            int mid = start + (last - start) / 2;

            // case 1
            // when mid-element is greater than next element, return the mid.
            if (mid < last && nums[mid] > nums[mid+1]){
                return mid;
            }

            // if the previous element is greater than the mid-element,
            else if (mid > start && nums[mid -1] > nums[mid]){
                return mid - 1;
            }

            // if start >= mid-element then since we are focusing on the max element then according to the given condition
            // all element after mid are smaller than the start and ans would be found in the start and mid, range values.
            else if (nums[start] >= nums[mid]){
                last = mid;
            }

            // if start < mid-element then previous element can be ignored since they are smaller than the mid
            else {
                start = mid + 1;
            }

        }

        return -1;
    }

    static int getPivotWithDuplicates(int[] nums){
        int start = 0;
        int last = nums.length - 1;

        while (start < last){
            int mid = start + (last - start) / 2;

            // case 1
            // when mid-element is greater than next element, return the mid.
            if (mid < last && nums[mid] > nums[mid+1]){
                return mid;
            }

            // if the previous element is greater than the mid-element,
            if (mid > start && nums[mid -1] > nums[mid]){
                return mid - 1;
            }

            // if mid, start, last are equal values
            if (nums[mid] == nums[start] && nums[mid] == nums[last]){
                // check if pivot is related to any of them that is start or last
                // check whether start is pivot
                if (nums[start] > nums[start+1]){
                    return start;
                }
                // increase the start
                start++;

                // check whether last is pivot
                if (nums[last] < nums[last - 1]){
                    return last-1;
                }
                // decrease the last
                last--;
            }
            // left part is sorted and then pivot lies in the right
            else if (nums[start] <= nums[mid] && nums[mid] > nums[last]){
                start = mid + 1;
            }

            else {
                last = mid - 1;
            }
        }

        return -1;
    }

    static int getTarget(int[] nums, int target, int start, int last){
        while (start <= last){
            int mid = start + (last - start) / 2;

            if (nums[mid] == target){
                return mid;
            }

            else if (nums[mid] > target){
                last = mid - 1;
            }

            else {
                start = mid + 1;
            }
        }

        return -1;
    }
}
