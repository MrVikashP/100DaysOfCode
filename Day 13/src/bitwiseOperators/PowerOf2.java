package bitwiseOperators;

public class PowerOf2 {
    public static void main(String[] args) {
        int n = 1;

        boolean ans = ((n & n-1) == 0);

        if (n <= 0) {
            System.out.println(false);
        }
        System.out.println(ans);
    }
}
