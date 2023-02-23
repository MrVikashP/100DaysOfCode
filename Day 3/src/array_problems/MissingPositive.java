package array_problems;

public class MissingPositive {
    public static void main(String[] args) {
        int[] arr = {1,0,2};
        int res = firstMissingPositive(arr);
        System.out.println(res);
    }

    static int firstMissingPositive(int[] nums){
        // actually the smallest positive number is 1 and max would be n
        // we find a range here so first sort the array and check for the correct index like we do in cycle sort
        // the first incorrect index in the answer first missing positive

        int index = 0;
        while (index < nums.length){
            if (nums[index] < 0 || nums[index] >= nums.length){
                index++;
            }
            else {
                int ci = nums[index];

                if (nums[ci] != nums[index]){
                    swap(nums,ci,index);
                }

                else index++;
            }
        }

        // searching for the first missing positive
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != i ){
                return i;
            }
        }
        return nums.length;
    }
    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
