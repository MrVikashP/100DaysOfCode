package revision.recursion;

public class NthFibonacci {
    public static void main(String[] args) {
        // 011235813
        int ans = printFib(7);
        System.out.println(ans);
    }

    static int printFib(int num) {
        if (num == 0){
            return 0;
        }

        if (num == 1){
            return 1;
        }

        return printFib(num - 1) + printFib(num - 2);
    }
}
