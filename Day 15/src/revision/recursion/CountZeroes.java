package revision.recursion;

public class CountZeroes {
    public static void main(String[] args) {
        int n = 1200014;
        System.out.println(getCountOfZero(n, 0));
    }

    static int getCountOfZero(int num, int count) {
        if (num == 0) {
            return count;
        }

        int rem = num % 10;
        if (rem == 0) {
            return getCountOfZero(num / 10, count + 1);
        }

        return getCountOfZero(num / 10, count);
    }
}
