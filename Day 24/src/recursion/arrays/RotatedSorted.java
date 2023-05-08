package recursion.arrays;

public class RotatedSorted {
    public static void main(String[] args) {
        int[] nums = {5,6,7,8,9,1,2,3};
        int target = 6;

        System.out.println(getTarget(nums, target, 0, nums.length-1));
    }

    static int getTarget(int[] nums, int target, int start, int end) {

        if (start > end){
            return -1;
        }

        int mid = start + (end - start) / 2;
        if (nums[mid] == target) {
            return mid;
        }

        if (nums[start] <= nums[mid]) {
            if (target >= nums[start] && target <= nums[mid]) {
                return getTarget(nums,target,start,mid-1);
            }
            else return getTarget(nums,target,mid + 1,end);
        }

        else if (target >= nums[mid] && target <= nums[end]) {
            return getTarget(nums,target,mid+1,end);
        }

        else return getTarget(nums,target,start,mid-1);
    }
}
