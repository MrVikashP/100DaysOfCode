package bitwiseOperators;

public class TotalDigits {
    public static void main(String[] args) {
        int n = 23456;
        int base = 10;

        int digits = (int) (Math.log(n) / Math.log(base) + 1);

        System.out.println(digits);
    }
}
