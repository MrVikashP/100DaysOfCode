package bitwiseOperators;

public class MagicNumber {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(printMagicNo(n));
    }

    static int printMagicNo(int n) {
        int ans = 0;
        int base = 5;
        while (n > 0) {
            int last = n & 1;
            n >>= 1;

            ans = base * last;

            base = base * 5;
        }

        return ans;
    }
}
