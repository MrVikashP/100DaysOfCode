package revision.searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};

        int target = 5;

        System.out.println(printTargetIndex(nums, target));
    }

    static int printTargetIndex(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
