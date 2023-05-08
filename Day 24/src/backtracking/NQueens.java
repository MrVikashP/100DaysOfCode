package backtracking;

public class NQueens {
    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];

        System.out.println(placeQueen(board,0));


    }

    static int placeQueen(boolean[][] board, int row) {
        if (row == board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;

        for (int col = 0; col < board.length; col++) {
            // placing queen if it is safe
            if (isSafe(board, row, col)){
                board[row][col] = true;
                count += placeQueen(board,row + 1);
                board[row][col] = false;
            }
        }

        return count;
    }

    static void display(boolean[][] board) {
        for (boolean[] elements : board){
            for (boolean element : elements){
                if (element){
                    System.out.print("Q ");
                }
                else System.out.print("x ");
            }

            System.out.println();
        }
    }

    static boolean isSafe(boolean[][] board, int row, int col) {
        // vertical check
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        // check left diagonally
        for (int i = 1; i <= Math.min(row,col); i++) {
            if (board[row-i][col-i]){
                return false;
            }
        }

        // check right diagonally
        for (int i = 1; i <= Math.min(row,board.length-col-1); i++) {
            if (board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }
}
