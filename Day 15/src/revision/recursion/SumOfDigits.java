package revision.recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 137;
        int ans = printSum(num, 0);
        System.out.println(ans);
    }

    static int printSum(int num, int ans) {
        if (num == 0) {
            return ans;
        }

        int lastDigit = num % 10;
        ans += lastDigit;

        return printSum(num / 10, ans);
    }
}
