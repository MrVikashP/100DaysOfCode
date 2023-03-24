package hashset_hashmap_problems;

import java.util.HashMap;
import java.util.Set;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {1,3,2,4,1,3,1,1,5};
        int[] nums1 = {3,2};

        itemInMajor(nums);
        itemInMajor(nums1);
    }

    private static void itemInMajor(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            }
            else {
                map.put(i, 1);
            }
        }

        Set<Integer> keys = map.keySet();
        for (int i : keys) {
            if (map.get(i) > nums.length / 3) {
                System.out.println(i);
            }
        }

    }
}
