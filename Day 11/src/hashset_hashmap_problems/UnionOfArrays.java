package hashset_hashmap_problems;

import java.util.HashSet;

public class UnionOfArrays {
    public static void main(String[] args) {
        int[] nums1 = {7,3,9};
        int[] nums2 = {2,3,7,3,9,1,2,9};

        findUnion(nums1, nums2);
    }

    private static void findUnion(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();

        for (int i : nums1) {
            set.add(i);
        }

        for (int j : nums2) {
            set.add(j);
        }

        System.out.println(set);
    }
}
