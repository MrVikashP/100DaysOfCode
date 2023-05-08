package recursion.basic;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(getReverse(n));
    }

    static int getReverse(int n) {
        if (n % 10 == n) {
            return n;
        }
        int digits = (int) Math.log10(n) + 1;

        return (int)((n % 10) * Math.pow(10,digits - 1)) + getReverse(n / 10);
    }
}
