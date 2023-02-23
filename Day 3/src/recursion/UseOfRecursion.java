package recursion;

public class UseOfRecursion {
    public static void main(String[] args) {
        // print 1 2 3 4 5  without using loop and multiple methods creation
        printNum(1);
    }
    static void printNum(int n){
        // base condition
        if (n == 5){
            System.out.println(n);
            return;
        }
        // print the value of n
        System.out.println(n);
        // calling function itself
        printNum(n + 1);
    }

    // every new call to function takes a separate memory and repeats if not provided a base condition
    // where function stop calling itself again and execute the work and then come back to where it was called.



}
