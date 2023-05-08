package recursion.basic;

public class TotalSteps {
    public static void main(String[] args) {
        int n = 14;
        System.out.println(numberOfSteps(n));
    }

    static int numberOfSteps(int n) {
        return totalSteps(n, 0);
    }

    static int totalSteps(int n, int steps){
        if (n == 0){
            return steps;
        }

        if ((n & 1) == 0) {
            return totalSteps(n / 2, steps+1);
        }
        return totalSteps(n - 1, steps+1);
    }
}
