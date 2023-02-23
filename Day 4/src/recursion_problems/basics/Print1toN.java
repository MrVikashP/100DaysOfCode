package recursion_problems.basics;

public class Print1toN {
    public static void main(String[] args) {
        printNums(5);
    }
    static void printNums(int n){
        if (n == 1){
            System.out.println(1);
            return;
        }
        printNums(n-1);
        System.out.println(n);
    }
}
