package recursion_problems.basics;

public class FactorialOfN {
    public static void main(String[] args) {
        int ans = findFactorial(5);
        System.out.println(ans);
    }
    static int findFactorial(int n){
        // base condition
        if (n == 1 || n == 0){
            return 1;
        }
        return n * findFactorial(n-1);

        // since f(5) = 5 * 4 * 3 * 2 * 1;
        // so f(5) = 5 * f(4);
        // f(n) = n * f(n-1);
    }
}
