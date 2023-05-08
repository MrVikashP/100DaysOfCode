package backtracking;

public class NKnights {
    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];

        placeKnights(board,0,0,4);
    }

    static void placeKnights(boolean[][] board, int row, int col, int total) {
        if (total == 0){
            display(board);
            System.out.println();
            return;
        }
        if (row == board.length - 1 && col == board.length) {
            return;
        }
        if (col == board.length){
            placeKnights(board, row + 1, 0, total);
            return;
        }

        if (isSafe(board,row,col)){
            board[row][col] = true;
            placeKnights(board, row,col+1, total - 1);
            board[row][col] = false;
        }

        placeKnights(board,row,col+1, total);
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        if (isValid(board,row-2,col-1)) {
            if (board[row-2][col-1]){
                return false;
            }
        }
        if (isValid(board,row-2,col+1)) {
            if (board[row-2][col+1]){
                return false;
            }
        }
        if (isValid(board,row-1,col-2)) {
            if (board[row-1][col-2]){
                return false;
            }

        }
        if (isValid(board,row-1,col+2)) {
            if (board[row-1][col+2]){
                return false;
            }

        }
        return true;

    }

    static boolean isValid(boolean[][] board, int row, int col){
        if (row >= 0 && row < board.length && col >=0 && col < board.length){
            return true;
        }
        return false;
    }

    static void display(boolean[][] board) {
        for (boolean[] elements : board){
            for (boolean element : elements){
                if (element){
                    System.out.print("K ");
                }
                else System.out.print("x ");
            }

            System.out.println();
        }
    }
}
