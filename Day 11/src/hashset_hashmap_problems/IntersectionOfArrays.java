package hashset_hashmap_problems;

import java.util.HashSet;
import java.util.Iterator;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        int[] arr1 = {7,3,9};
        int[] arr2 = {6,3,9,2,9,4};

        findIntersection(arr1,arr2);
    }

    private static void findIntersection(int[] arr1, int[] arr2) {
        HashSet<Integer> set1 = new HashSet<>();
        for (int i : arr1) {
            set1.add(i);
        }

        for (int j : arr2) {
            if (set1.contains(j)) {
                System.out.println(j);
                set1.remove(j);
            }
        }

    }
}
