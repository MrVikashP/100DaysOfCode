package array_problems;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {0,1};
        int ans = getMissingNumber(nums);
        System.out.println(ans);
    }

    static int getMissingNumber(int[] nums){
        int start = 0;
        int length = nums.length;

        // sorting the array using cycle sort
        while (start < length){
            int correctIndex = nums[start];
            if (correctIndex < length && correctIndex != start){
                // do swap
                int temp = nums[correctIndex];
                nums[correctIndex] = nums[start];
                nums[start] = temp;
            }
            else {
                start++;
            }
        }

        // search for the missing number
        // case 1
        for (int index = 0; index < length; index++) {
            if (nums[index] != index){
                return index;
            }
        }

        // case 2
        return length;
    }
}
