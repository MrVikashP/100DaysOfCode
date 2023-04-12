package array_problems;

public class DuplicateNumbers {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        int ans = findDuplicates(nums);
        System.out.println(ans);
    }

    static int findDuplicates(int[] nums){

        int i = 0;
        while (i < nums.length){
            int correctIndex = nums[i] - 1;

            if (nums[correctIndex] != nums[i]){
                swap(nums,i,correctIndex);
            }
            else i++;
        }

        // searching for repetitive element
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1){
                return nums[index];
            }
        }
        return -1;
    }
    static void swap(int[] nums, int first, int second){

        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
