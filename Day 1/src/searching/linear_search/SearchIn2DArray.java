package searching.linear_search;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] nums = {
                {2,3,4},
                {11,23,1,19,21},
                {9,3,10,11}
        };
        System.out.println(isPresent(nums, 21));
        System.out.println(Arrays.toString(findIndex(nums,21)));
    }
    static boolean isPresent(int[][] nums, int target){
        for (int[] arr : nums){
            for (int val : arr){
                if (val == target){
                    return true;
                }
            }
        }
        return false;
    }
    static int[] findIndex(int[][] nums, int target){
        for (int row = 0; row < nums.length; row++){
            for (int col = 0; col < nums[row].length; col++) {
                if (nums[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }

        return new int[]{-1,-1};
    }

}
