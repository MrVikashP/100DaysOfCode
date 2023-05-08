package backtracking;

public class SodukoSolver {
    public static void main(String[] args) {
        int[][] board = {
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        if (solve(board)) {
            display(board);
        } else {
            System.out.println("Cannot solve");
        }
    }

    private static boolean solve(int[][] board) {
        int n =  board.length;
        int r = -1;
        int c = -1;

        boolean isLeft = true;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 0){
                    r = i;
                    c = j;
                    isLeft = false;
                    break;
                }

            }

            if (!isLeft){
                break;
            }
        }

        if (isLeft){
            return true;
        }

        for (int i = 1; i <= 9; i++) {
            if (isSafe(board,r,c,i)){
                board[r][c] = i;

                if (solve(board)){
                    return true;
                }

                else {
                    board[r][c] = 0;
                }
            }
        }

        return false;

    }

    static boolean isSafe(int[][] board, int row, int col, int num){
        // col
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == num){
                return false;
            }
        }

        // row
        for (int[] nums : board){
            if (nums[col] == num){
                return false;
            }
        }

        int sqrt = (int) Math.sqrt(board.length);
        int rs = row - row % sqrt;
        int cs = col - col % sqrt;

        for (int i = rs; i < rs + sqrt; i++) {
            for (int j = cs; j < cs + sqrt; j++) {
                if (board[rs][cs] == num){
                    return false;
                }
            }
        }

        return true;

    }

    static void display(int[][] board){
        for (int[] row : board){
            for (int num:row){
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }
}
