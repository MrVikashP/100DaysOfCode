package revision.recursion;

public class NumbersExample {
    public static void main(String[] args) {
        // print 1 - 5
        printInOrder(1);
        // print 5 - 1
        printInReverse(1);
    }

    static void printInOrder(int num) {
        if (num == 5) {
            System.out.print(5 + " ");
            System.out.println();
            return;
        }
        System.out.print(num + " ");
        printInOrder(num + 1);

    }
    static void printInReverse(int num) {
        if (num == 5) {
            System.out.print(5 + " ");
            return;
        }

        printInReverse(num + 1);
        System.out.print(num + " ");
    }
}
