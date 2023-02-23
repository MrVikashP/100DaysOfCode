package array_problems;

// https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
public class NextGreatestLetter {
    //
    public char nextGreatestLetter(char[] letters, char target){
        int start = 0;
        int end = letters.length - 1;

        // if the letter is greater than the last letter then return the first one
        if (target >= letters[end]){
            return letters[start];
        }

        while (start <= end){
            // finding mid element
            int mid = start + (end - start) / 2;

            if (letters[mid] > target){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        // return the next greater letter than target
        return letters[start];
    }

}
