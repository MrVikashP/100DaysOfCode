package searching.linear_search;

import java.util.Objects;

public class LinearSearchString {
    public static void main(String[] args) {
        String[] name = {"vikash", "tom", "baby", "raj"};
        System.out.println(isValuePresent(name, "raj"));
        System.out.println(isValueThere(name, "raj"));

        String naam = "Vikash";
        System.out.println(isCharPresent(naam, 'k'));
        System.out.println(isCharThere(naam, 'v'));


    }

    // checking whether present or not.
    static boolean isValuePresent(String[] arr, String val){
        for (String element : arr) {
            if (element.equals(val)) {
                return true;
            }
        }
        return false;
    }

    // returning the index of the required element if present
    static int isValueThere(String[] arr, String val){
        for (int index = 0; index < arr.length; index++) {
            if (Objects.equals(val, arr[index])){
                return index;
            }
        }
        return -1;
    }

    static boolean isCharPresent(String naam, char val){
        for (char letter : naam.toCharArray()){
            if (letter == val){
                return true;
            }
        }
        return false;
    }
    static int isCharThere(String naam, char val){
        for (int i = 0; i < naam.length(); i++) {
            if (val == naam.charAt(i)){
                return i;
            }
        }
        return -1;
    }
}

// Time complexity
// for best case - O(1) Big O of 1 - when element is present at zero index, loop will run for once : 1 comparison
// for worst case - O(n) Big O of n - when element is present at last index, loop will run for n times : n comparison
