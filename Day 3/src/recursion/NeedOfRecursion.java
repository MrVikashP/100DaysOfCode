package recursion;

public class NeedOfRecursion {
    public static void main(String[] args) {
        // function calling itself is what mean by the recursion

        // print any message 3 times without using loop
        printMessage("Karma Karo");

        // print 1 2 3 4 5
        printNumber1(1);
    }
    // printing message
    static void printMessage(String msg){
        System.out.println(msg);
        // calling function 2
        printMessage2(msg);
    }
    static void printMessage2(String msg){
        System.out.println(msg);
        // calling function 3
        printMessage3(msg);
    }
    static void printMessage3(String msg){
        System.out.println(msg);
        // returning to where it was called
    }

    // printing numbers
    static void printNumber1(int n){
        System.out.println(n);
        printNumber2(2);
    }
    static void printNumber2(int n){
        System.out.println(n);
        printNumber3(3);
    }
    static void printNumber3(int n){
        System.out.println(n);
        printNumber4(4);
    }
    static void printNumber4(int n){
        System.out.println(n);
        printNumber5(5);
    }
    static void printNumber5(int n){
        System.out.println(n);
    }

    // function calls made in the stack memory
    // after when function finished executing it come out from it was called.
    // unfinished function will remain be in the stack waiting for its execution.

}