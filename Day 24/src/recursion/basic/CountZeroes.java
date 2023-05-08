package recursion.basic;

public class CountZeroes {
    public static void main(String[] args) {
        int n = 2100241;
        getCount(n);
        System.out.println(count);
        System.out.println(getCount2(n,0));
    }

    static int count = 0;

    static void getCount(int n){
        if (n == 0){
            return;
        }

        if (n % 10 == 0){
            count++;
        }

        getCount(n/10);
    }

    static int getCount2(int n, int count){
        if (n == 0){
            return count;
        }

        if (n % 10 == 0){
            return getCount2(n/10, count+1);
        }

        return getCount2(n/10, count);

    }
}
