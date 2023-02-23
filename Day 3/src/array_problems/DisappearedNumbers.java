package array_problems;

import java.util.ArrayList;
import java.util.List;

public class DisappearedNumbers {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> res = findDisappearedNumbers(nums);
        System.out.println(res);
    }

    static List<Integer> findDisappearedNumbers(int[] nums){
        List<Integer> ans = new ArrayList<>();

        int i = 0;

        while (i < nums.length){
            int correctIndex = nums[i] - 1;

            if (nums[correctIndex] != nums[i]){
                swap(nums,i,correctIndex);
            }
            else i++;
        }

        // checking for disappeared numbers in the array
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1){
                ans.add(index + 1);
            }
        }
        return ans;
    }

    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
