package recursion;

public class FibonacciNumbers {
    public static void main(String[] args) {
        // fib(n) = fib(n-1) + fib(n-2)
        // fib(n) = sum of previous two values
        // so here getting an equation which can help us to get the result
        // 0 1 1 2 3 5 8 13......
        int n = 6;
        int fib_num = getFibNumAt(n);
        System.out.println(fib_num);

    }
    static int getFibNumAt(int n){
        // base condition where function call starts returning means stopped function calls
        // since first two numbers are 0,1
        if (n == 1 || n == 2){
            return n-1;
        }
        // any fib number is sum of the previous two numbers
        int ans = getFibNumAt(n-1) + getFibNumAt(n-2);
        return ans;
    }
}
