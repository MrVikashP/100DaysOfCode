package recursion_problems.basics;

public class PrintNto1 {
    public static void main(String[] args) {
        printNumbers(5);
    }
    static void printNumbers(int n){
        if (n == 1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printNumbers(n-1);
    }
}
