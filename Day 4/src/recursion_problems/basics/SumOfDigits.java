package recursion_problems.basics;

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 3456;
        int sum = getSum(num, 0);
        System.out.println(sum);
    }
    static int getSum(int num, int sum){
        // find each digit and add it to the next one.
        // base condition is when num < 0 then return
        if (num == 0){
            return sum;
        }
        int digit = num % 10;
        return getSum(num / 10, sum + digit);
    }
}
