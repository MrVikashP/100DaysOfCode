package bitwiseOperators;

public class NumberOfSetBits {
    public static void main(String[] args) {
        int n = 1264;

        System.out.println(Integer.toBinaryString(n));

        System.out.println(count(n));
    }

    private static int count(int n) {
        int c = 0;

        while (n > 0) {
            c++;

            n -= n & -n;
        }

        return c;
    }
}
