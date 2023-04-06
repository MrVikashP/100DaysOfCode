package revision.recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {3,4,5,6,7,8,10,11,19,21};
        int target = 0;
        int reqIndex = search(nums, target, 0, nums.length - 1);
        System.out.println(reqIndex);

    }

    static int search(int[] nums, int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int mid = s + (e - s) / 2;

        if (target < nums[mid]) {
            return search(nums, target, s, mid - 1);
        }

        else if (target > nums[mid]) {
            return search(nums,target, mid + 1, e);
        }

        return mid;
    }

}
