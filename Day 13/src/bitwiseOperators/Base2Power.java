package bitwiseOperators;

public class Base2Power {
    public static void main(String[] args) {
        int base = 3;
        int power = 6;

        System.out.println(getResult(base, power));
    }

    static int getResult(int base, int power) {
        int ans = 1;

        while (power > 0) {
            int last = power & 1;

            if (last != 0) {
                ans *= base;
            }

            base *= base;
            power >>= 1;

        }

        return ans;
    }
}
