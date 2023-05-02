package binarySearch;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {2,9,2,2,2,2,2,2};

        int target = 2;

        System.out.println(getTargetIndex(nums,target));
    }

    static int getTargetIndex(int[] nums, int target) {
        int pivot = findPivotDuplicates(nums);
        if (pivot == -1) {
            return search(nums,target,0, nums.length-1);
        }

        if (nums[pivot] == target) {
            return pivot;
        }

        if (target >= nums[0]) {
            return search(nums,target,0, pivot - 1);
        }

        return search(nums,target,pivot+1,nums.length-1);

    }

    static int findPivot(int[] nums) {
        int s = 0;
        int e = nums.length - 1;

        while ( s <= e) {
            int mid = s + (e-s)/2;

            if (mid < e && nums[mid] > nums[mid + 1]) {
                return mid;
            }

            else if (mid > s && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            else if (nums[s] >= nums[mid]){
                e = mid - 1;
            }
            else s = mid + 1;
        }

        return -1;
    }

    static int findPivotDuplicates(int[] nums) {
        int s = 0;
        int e = nums.length - 1;

        while ( s <= e) {
            int mid = s + (e-s)/2;

            if (mid < e && nums[mid] > nums[mid + 1]) {
                return mid;
            }

            else if (mid > s && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            else if (nums[s] < nums[mid] || nums[s] == nums[mid] && nums[mid] > nums[e]) {
                s = mid + 1;
            }
            else e = mid - 1;
        }

        return -1;
    }

    static int search(int[] nums, int target, int s, int e) {

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            else if (target > nums[mid]) {
                s = mid + 1;
            }

            else e = mid - 1;
        }

        return -1;
    }
}
