package array_problems;

public class MaxInArray {
    public static void main(String[] args) {
        int[] nums = {23,-2,13,45,90,1};
        int max = findMax(nums);
        int maxIndex = findMaxInRange(nums, 1, 3);
        System.out.println(max);
        System.out.println(maxIndex);
    }

    static int findMaxInRange(int[] nums, int start, int end) {
        if (start > end){
            return -1;
        }
        if (nums == null){
            return -1;
        }

        int maxIndex = start;
        int max = nums[start];

        for (int i = start; i <= end; i++) {
            if (nums[i] > max){
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    static int findMax(int[] nums){
        int max = nums[0]; // suppose max is element at zero index

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max){
                max = nums[i];
            }
        }

        return max;
    }
}
