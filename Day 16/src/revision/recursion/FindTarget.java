package revision.recursion;

import java.util.ArrayList;

public class FindTarget {
    public static void main(String[] args) {
        int[] ints = {10,11,68,39,23,47,45,89,39,39,100};
        int target = 39;
        System.out.println(findTarget(ints, target, 0));
        System.out.println(findTarget2(ints, target, 0));
        findTarget3(ints,target,0);

        System.out.println(findTarget4(ints,target,0, new ArrayList<>()));
        System.out.println(findTarget5(ints, target, 0));

    }

    static boolean findTarget(int[] nums, int target, int index) {
        if (index == nums.length ) {
            return false;
        }

        return nums[index] == target || findTarget(nums, target, index + 1);
    }

    // finding index of target
    static int findTarget2(int[] nums, int target, int index) {
        if (index == nums.length) {
            return -1;
        }

        if (nums[index] == target) {
            return index;
        }

        else return findTarget2(nums,target,index+1);

    }

    // finding all index - three approaches.

    static ArrayList<Integer> ans = new ArrayList<>();

    // defining arraylist outside the function call
    static void findTarget3(int[] nums, int target, int index) {
        if (index == nums.length) {
            System.out.println(ans);
            return;
        }

        if (nums[index] == target) {
            ans.add(index);
        }

        findTarget3(nums, target, index + 1);
    }

    // putting ArrayList inside the function call
    static ArrayList<Integer> findTarget4(int[] nums, int target, int index, ArrayList<Integer> res) {
        if (index == nums.length) {
            return res;
        }

        if (nums[index] == target) {
            res.add(index);
        }

        return findTarget4(nums,target,index + 1, res);
    }

    // putting ArrayList in the body of the function call
    static ArrayList<Integer> findTarget5(int[] nums, int target, int index) {
        if (index == nums.length) {
            return new ArrayList<>();
        }
        ArrayList<Integer> ans = new ArrayList<>();

        if (nums[index] == target) {
            ans.add(index);
        }

        ArrayList<Integer> listForAboveCalls = findTarget5(nums, target, index + 1);
        ans.addAll(listForAboveCalls);
        return ans;
    }
}
