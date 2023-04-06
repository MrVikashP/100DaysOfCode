package revision.recursion;

public class Factorial {
    public static void main(String[] args) {
        int num = 6;

        int ans = printFact(num);
        System.out.println(ans);
    }

    static int printFact(int num) {
        if (num == 1 || num == 0) {
            return 1;
        }

        return num * printFact(num - 1);

    }
}
