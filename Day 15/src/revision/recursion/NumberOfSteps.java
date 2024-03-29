package revision.recursion;

public class NumberOfSteps {
    public static void main(String[] args) {
        int num = 14;

        System.out.println(findTotalSteps(num));
    }

    static int findTotalSteps(int num) {
        return helper(num, 0);
    }

    static int helper(int num, int steps) {
        if (num == 0) {
            return steps;
        }

        if ((num & 1) == 0) {
            return helper(num / 2, steps + 1);
        }
        return helper(num - 1, steps + 1);
    }
}
