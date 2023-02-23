package recursion_problems.basics;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 54321;
        System.out.println(getReverse(num, 0));
    }
    static int getReverse(int num, int ans){
        if (num == 0){
            return ans;
        }
        int digit = num % 10;
        return getReverse(num / 10, ans * 10 + digit);
    }
}
