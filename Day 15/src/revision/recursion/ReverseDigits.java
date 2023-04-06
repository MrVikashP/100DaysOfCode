package revision.recursion;

public class ReverseDigits {
    public static void main(String[] args) {
        int num = 1234;
        reverse(num);
        System.out.println(reverse2(num));
    }
    static int ans = 0;
    static void reverse(int num){
        if (num == 0) {
            System.out.println(ans);
            return;
        }

        ans = (ans * 10) + (num % 10);

        reverse(num / 10);
    }

    static int reverse2(int num) {
        int digits = (int) Math.log10(num) + 1;

        return helper(num,digits);
    }

    static int helper(int num, int base) {
        if (num % 10 == num){
            return num;
        }

        int rem = num % 10;

        return (int) (rem * Math.pow(10, base - 1)) + helper(num / 10, base - 1);



    }
}
