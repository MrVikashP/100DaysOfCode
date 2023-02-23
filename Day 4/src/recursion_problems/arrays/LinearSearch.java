package recursion_problems.arrays;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {6,2,5,3,4,4,1,8,9,0};
        System.out.println(search(arr,8, 0));
        System.out.println(search2(arr,4,0, new ArrayList<>()));
        System.out.println(search3(arr,4,0));
    }
    static int search(int[] arr, int target, int index) {
        if (index >= arr.length){
            return -1;
        }

        if (arr[index] == target){
            return index;
        }

        return search(arr, target, index + 1);
    }

    // taking list in the argument
    // create list outside the function and then print list.
    static ArrayList<Integer> search2(int[] arr, int target, int index, ArrayList<Integer> ans){
        if (index == arr.length){
            return ans;
        }

        if (arr[index] == target){
            ans.add(index);
        }

        return search2(arr,target,index + 1, ans);
    }

    // create list in the body and then return
    static ArrayList<Integer> search3(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length){
            return list;
        }

        // this will contain answer for that function call only because for every function call new Arraylist is created.
        if (arr[index] == target){
            list.add(index);
        }

        // answer from below function calls
        ArrayList<Integer> ans = search3(arr,target,index + 1);
        list.addAll(ans);
        return list;
    }
}
