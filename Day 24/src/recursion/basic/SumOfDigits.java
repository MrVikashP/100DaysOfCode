package recursion.basic;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(printSum(n));
    }

    static int printSum(int n) {
        if (n == 0) {
            return 0;
        }

        return (n % 10) + printSum(n / 10);
    }
}
