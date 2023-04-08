package revision.recursion;

public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] ints = {5,6,7,-2,1,2,3,4};
        int target = 6;
        System.out.println(printTargetIndex(ints, target, 0, ints.length - 1));

    }
    static int printTargetIndex(int[] nums, int target, int s, int e) {

        if (s > e) {
            return -1;
        }

        int mid = (s + e) / 2;

        if (nums[mid] == target) {
            return mid;
        }

        // case 1
        if (nums[mid] >= nums[s]) {
            if (target >= nums[s] && target <= nums[mid]) {
                return printTargetIndex(nums,target,s, mid - 1);
            }
            else return printTargetIndex(nums,target,mid+1,e);
        }

        // case 2
        if (target >= nums[mid] && target <= nums[e]) {
            return printTargetIndex(nums, target, mid + 1, e);
        }

        // case 3
        else return printTargetIndex(nums, target, s, mid - 1);

    }
}
