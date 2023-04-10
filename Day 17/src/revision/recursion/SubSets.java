package revision.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSets {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(findSubSets(nums));

        int[] nums2 = {1,2,2};
        System.out.println(findSubSetsDuplicates(nums2));

    }

    static List<List<Integer>> findSubSets(int[] arr) {
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(new ArrayList<>());

        for (int num : arr) {

            int size = lists.size();

            for (int i = 0; i < size; i++) {
                List<Integer> list = new ArrayList<>(lists.get(i));
                list.add(num);
                lists.add(list);
            }
        }

        return lists;
    }

    static List<List<Integer>> findSubSetsDuplicates(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(new ArrayList<>());

        int s = 0, e = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] == arr[i-1]) {
                s = e + 1;
            }
            e = lists.size() - 1;
            int n = lists.size();

            for (int j = s; j < n; j++) {
                List<Integer> list = new ArrayList<>(lists.get(j));
                list.add(arr[i]);
                lists.add(list);
            }
        }

        return lists;
    }
}
