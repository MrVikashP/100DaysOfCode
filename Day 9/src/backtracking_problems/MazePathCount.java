package backtracking_problems;

public class MazePathCount {
    public static void main(String[] args) {
        System.out.println("No of paths taken : " + pathCount(3,3));

    }

    static int pathCount(int row, int col) {
        if (row == 1 || col == 1) {
            return 1;
        }

        int first = pathCount(row - 1, col);
        int second = pathCount(row, col - 1);

        return first + second;
    }
}
