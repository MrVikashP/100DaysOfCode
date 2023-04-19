package leetcode;

// https://leetcode.com/problems/richest-customer-wealth/
public class Question2 {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,2},
                {3,2,1}
        };

        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int maxSum = 0;

        for (int[] account : accounts) {
            int sum = 0;
            for (int money : account){
                sum += money;
            }

            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        return maxSum;
    }
}
