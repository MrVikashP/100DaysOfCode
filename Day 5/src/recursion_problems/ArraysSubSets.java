package recursion_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysSubSets {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(getSubSets(arr));

        int[] nums = {1,2,2};
        System.out.println(getSubSetsDuplicates(nums));
    }

    // using iteration method, with recursion can be done like before.
    static List<List<Integer>> getSubSets(int[] arr){
        // creating list of list, type - integer
        List<List<Integer>> ans = new ArrayList<>();

        // initialize the empty list
        ans.add(new ArrayList<>());

        // for every number in the array either add it to the existing one
        for (int num : arr){
            // take the size of the ans list
            int n = ans.size();

            // create a copy of all the list existed then add the current num to it and then add it to the ans list again
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(ans.get(i));
                internal.add(num);
                ans.add(internal);
            }
        }
        return ans;
    }

    static List<List<Integer>> getSubSetsDuplicates(int[] arr){
        // when array is not sorted, then problem arises to adjust the elements and ignoring part
        Arrays.sort(arr);

        // creating list of list, type - integer
        List<List<Integer>> ans = new ArrayList<>();

        // initialize the empty list
        ans.add(new ArrayList<>());

        // create two variables s and e to manage for duplicates
        int s = 0, e = 0;

        // for every number in the array either add it to the existing one
        for (int i = 0; i < arr.length; i++){
            s = 0;
            // if the curr is same as previous as have to add it to the new list added recently instead of adding it to all
            // existing ones because it will produce the duplicate lists.
            if (i > 0 && arr[i] == arr[i-1]){
                s = e + 1;
            }
            e = ans.size() - 1;
            // take the size of the ans list
            int n = ans.size();

            // create a copy of all the list existed then add the current num to it and then add it to the ans list again
            for (int j = s; j < n; j++) {
                List<Integer> internal = new ArrayList<>(ans.get(j));
                internal.add(arr[i]);
                ans.add(internal);
            }
        }
        return ans;
    }

}

// time complexity : O(N * 2 to power N), Space Complexity : O(2 to power N * N)
// total number of subsets at each level will be 2 to power N, N is the number of elements in an array
