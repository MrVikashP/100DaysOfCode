package recursion_problems.basics;

public class ProductOfDigits {
    public static void main(String[] args) {
        System.out.println(findProduct(123));
    }
    static int findProduct(int n){
        if (n % 10 == n){
            return n;
        }
        return n % 10 * findProduct(n / 10);
    }
}
