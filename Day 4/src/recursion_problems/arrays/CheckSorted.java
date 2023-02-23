package recursion_problems.arrays;

public class CheckSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,5,4};
        System.out.println(isSorted(arr, 0));
    }
    static boolean isSorted(int[] nums, int index){
        // when index reaches at last means every number is at the right places
        if (index == nums.length - 1){
            return true;
        }

        return nums[index] < nums[index + 1] && isSorted(nums, index + 1);
    }
}
