package recursion.arrays;

import java.util.ArrayList;

public class FindTarget {
    public static void main(String[] args) {
        int[] nums = {10,134,22,1,6,9,19,11};

        int target = 22;

        System.out.println(findTargetIndex(nums,target,0));
        System.out.println(isAvailable(nums,target,0));

        int[] array = {22,13,24,13,13,21,10};
        int t = 13;
        System.out.println(findAllIndex(array,t,0));
        System.out.println(findAllIndex2(array,t,0,new ArrayList<>()));
        System.out.println(findAllIndex3(array,t,0));
    }

    static int findTargetIndex(int[] nums, int target, int index) {
        if (index == nums.length){
            return -1;
        }

        if (nums[index] == target) {
            return index;
        }

        return findTargetIndex(nums, target, index + 1);
    }

    static boolean isAvailable(int[] nums, int target, int index) {
        if (index == nums.length) {
            return false;
        }

        return nums[index] == target || isAvailable(nums,target,index+1);
    }


    static ArrayList<Integer> ans = new ArrayList<>();
    static ArrayList<Integer> findAllIndex(int[] nums, int target, int index) {
        if (index == nums.length) {
            return ans;
        }

        if (nums[index] == target) {
            ans.add(index);
        }

        return findAllIndex(nums,target,index+1);
    }

    static ArrayList<Integer> findAllIndex2(int[] nums, int target, int index, ArrayList<Integer> res){

        if (index == nums.length) {
            return res;
        }

        if (nums[index] == target) {
            res.add(index);
        }

        return findAllIndex2(nums,target,index+1,res);

    }

    static ArrayList<Integer> findAllIndex3(int[] nums, int target, int index) {
        if (index == nums.length) {
            ArrayList<Integer> list = new ArrayList<>();
            return list;
        }

        ArrayList<Integer> list = new ArrayList<>();
        if (nums[index] == target) {
            list.add(index);
        }

        ArrayList<Integer> ansFromAboveCalls = findAllIndex3(nums, target, index+1);
        list.addAll(ansFromAboveCalls);

        return list;
    }


}
