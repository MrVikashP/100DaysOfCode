package linkedList_problems;
// https://leetcode.com/problems/happy-number/description/
public class HappyNumber {
    public static void main(String[] args) {
        int num = 2;
        System.out.println(isHappy(num));
    }

    static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        while (true) {
            slow = squareDigitsSum(slow);
            fast = squareDigitsSum(squareDigitsSum(fast));

            if (slow == fast) {
                break;
            }
        }
        return slow == 1;
    }

    static int squareDigitsSum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}