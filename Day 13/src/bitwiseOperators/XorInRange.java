package bitwiseOperators;

public class XorInRange {
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 9;

        int ans = findXor(n2) ^ findXor(n1 - 1);

        System.out.println(ans);
    }

    static int findXor(int n) {

        if (n % 4 == 0) {
            return n;
        }

        else if (n % 4 == 1) {
            return 1;
        }

        else if (n % 4 == 2 ) {
            return n + 1;
        }

        return 0;

    }
}
