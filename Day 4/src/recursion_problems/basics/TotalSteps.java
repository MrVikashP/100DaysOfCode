package recursion_problems.basics;

public class TotalSteps {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(8));
    }
    static int numberOfSteps(int n){
        return getTotalSteps(n, 0);
    }
    static int getTotalSteps(int n, int ans){
        if (n == 0){
            return ans;
        }
        // if even then divide the number by 2
        if (n % 2 == 0){
            return getTotalSteps(n / 2, ans + 1);
        }
        // otherwise subtract 1 from the number
        return getTotalSteps(n - 1, ans + 1);
    }
}
