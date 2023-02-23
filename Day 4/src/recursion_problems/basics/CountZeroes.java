package recursion_problems.basics;

public class CountZeroes {
    public static void main(String[] args) {
        System.out.println(printTotal0(2302001, 0));
    }
    static int printTotal0(int n, int total){
        if (n == 0){
            return total;
        }
        if (n % 10 == 0){
            total++;
        }
        return printTotal0(n / 10, total);
    }
}
