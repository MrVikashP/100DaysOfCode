package array_problems;

// Question link
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class FindNumbers {
    // Given an array nums of integers, return how many of them contain an even number of digits.
    public int findNumbers(int[] nums){
        // a variable to store the count
        int total = 0;
        // check for the every element
        for (int i = 0; i < nums.length; i++) {
            int digits = getDigits(nums[i]);

            // if the digit is even then increment the total
            if (digits % 2 == 0){
                total++;
            }
        }
        return total;
    }
    private int getDigits(int num){
        int count = 0;
        while (num > 0){
            // increase the count until num is greater than 0.
            count++;
            num /= 10;
        }
        return count;

        // can find the number of digits with the single line written below
        //return (int) Math.log10(num) + 1;
    }

}
