package array_problems;

// Question link
// https://leetcode.com/problems/richest-customer-wealth/
public class MaximumWealth {
    public int maximumWealth(int[][] accounts){
        // check for the every array to get the wealth
        // check for maxVal
        int maxVal = 0;
        for (int[] individual : accounts){
            int wealth = getWealth(individual);

            // check if the wealth is greater than maxVal
            if (wealth > maxVal){
                maxVal = wealth;
            }
        }
        return maxVal;
    }

    private int getWealth(int[] individual){
        // in the starting sum starts with 0
        int sum = 0;
        for (int val : individual){
            // add each value in individual array
            sum += val;
        }
        return sum;
    }

}
