package searching.linear_search;

public class LinearSearchArrays {
    public static void main(String[] args) {
        int[] arr = {23, 11, 34, 20, 45};
        System.out.println(isValuePresent(arr, 45));
        System.out.println(isValueThere(arr, 20));

    }
    // checking whether present or not.
    static boolean isValuePresent(int[] arr, int val){
        for (int element : arr) {
            if (val == element) {
                return true;
            }
        }
        return false;
    }

    // returning the index of the required element if present
    static int isValueThere(int[] arr, int val){
        for (int index = 0; index < arr.length; index++) {
            if (val == arr[index]){
                return index;
            }
        }
        return -1;
    }
}

// Time complexity
// for best case - O(1) Big O of 1 - when element is present at zero index, loop will run for once : 1 comparison
// for worst case - O(n) Big O of n - when element is present at last index, loop will run for n times : n comparison
