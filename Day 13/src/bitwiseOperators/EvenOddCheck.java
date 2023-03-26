package bitwiseOperators;

public class EvenOddCheck {
    public static void main(String[] args) {
        int n = 7;
        isEvenOdd(n);
    }

    static void isEvenOdd(int n) {
        if ((n & 1) == 0){
            System.out.println("Even number");
        }
        else System.out.println("Odd");
    }
}
