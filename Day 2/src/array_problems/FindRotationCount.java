package array_problems;

public class FindRotationCount {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,8};
        int rotation = getRotation(nums);
        System.out.println(rotation);
    }

    static int getRotation(int[] nums){
        int pivot = getPivot(nums);
        return pivot + 1;
    }

    // use it when no duplicates present
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

    // use it when duplicates present
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
}
