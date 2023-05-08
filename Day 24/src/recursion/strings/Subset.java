package recursion.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        int[] arr = {1,2,3};

        System.out.println(getSubsets(arr));

        int[] arrays = {1,2,2};
        System.out.println(getSubsetsDuplicates(arrays));
    }

    static List<List<Integer>> getSubsets(int[] arr) {
        List<List<Integer>> outerList = new ArrayList<>();

        outerList.add(new ArrayList<>());

        for (int num : arr) {
            int n = outerList.size();

            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outerList.get(i));
                internal.add(num);
                outerList.add(internal);

            }
        }

        return outerList;
    }

    static List<List<Integer>> getSubsetsDuplicates(int[] arr) {

        Arrays.sort(arr);
        List<List<Integer>> outerList = new ArrayList<>();

        outerList.add(new ArrayList<>());
        int s = 0;
        int e = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] == arr[i-1]){
                s = e + 1;
            }
            e = outerList.size()-1;
            int n = outerList.size();

            for (int j = s; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outerList.get(j));
                internal.add(arr[i]);
                outerList.add(internal);

            }
        }
        return outerList;
    }
}
