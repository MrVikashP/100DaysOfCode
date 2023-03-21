package backtracking_problems;

public class NQueens {
    public static void main(String[] args) {
        int n = 5;
        boolean[][] board = new boolean[n][n];
        System.out.println(placeQueens(board, 0));

    }

    static int placeQueens(boolean[][] board, int row) {
        // base condition, when row reaches the board.length means all the queens are placed and printing it.
        if (row == board.length ) {
            display(board);
            System.out.println();
            return 1;
        }
        // initialize count to 0;
        int count = 0;

        // placing the queens, checking for the rows and cols
        // traverse through the cols for the row

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count += placeQueens(board, row + 1);
                board[row][col] = false;
            }
        }

        return count;
    }

    static boolean isSafe(boolean[][] board, int row, int col) {
        // check for the vertical cell whether queen present or not
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        // check for left diagonal
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft ; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }

        // check for the right diagonal
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }

        // if there is no queens while checking above then return true
        return true;

    }

    static void display(boolean[][] board) {
        for (boolean[] arr : board) {
            for (boolean element : arr) {
                // if element is true then print Queen at that cell
                if (element) {
                    System.out.print("Q ");
                }

                // otherwise print the cross
                else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }

    }
}

// space complexity - O(N * N)
// time complexity - O(N!)