package backtracking;

import java.util.ArrayList;

public class MazeProblem {
    public static void main(String[] args) {
//        System.out.println(countPath(3,3));
//        printPath("", 3,3);
//
//        System.out.println(printPath2("", 3,3));
//
//        System.out.println(printPathDiagonal("", 3,3));


        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };

        printPath3("", maze, 0,0);

    }

    static int countPath(int row, int col){
        if (row == 1 || col == 1){
            return 1;
        }

        int left = countPath(row - 1, col);
        int right = countPath(row,col-1);

        return left+right;
    }

    static void printPath(String p, int row, int col){
        if (row == 1 && col == 1){
            System.out.println(p);
            return;
        }

        if (row > 1) {
            printPath(p+'D', row - 1, col);
        }
        if (col > 1){
            printPath(p+'R', row,col-1);
        }
    }

    static ArrayList<String> printPath2(String p, int row, int col){
        if (row == 1 && col == 1){
            ArrayList<String> res = new ArrayList<>();
            res.add(p);
            return res;
        }

        ArrayList<String> ans = new ArrayList<>();

        if (row > 1) {
            ans.addAll(printPath2(p+'D', row - 1, col));
        }
        if (col > 1){
            ans.addAll(printPath2(p+'R', row,col-1));
        }

        return ans;
    }

    static ArrayList<String> printPathDiagonal(String p, int row, int col){
        if (row == 1 && col == 1){
            ArrayList<String> res = new ArrayList<>();
            res.add(p);
            return res;
        }

        ArrayList<String> ans = new ArrayList<>();

        if (row > 1 && col > 1){
            ans.addAll(printPathDiagonal(p+'D', row - 1, col - 1));
        }

        if (row > 1) {
            ans.addAll(printPathDiagonal(p+'V', row - 1, col));
        }
        if (col > 1){
            ans.addAll(printPathDiagonal(p+'H', row,col-1));
        }

        return ans;
    }

    static void printPath3(String p, boolean[][] maze, int row, int col) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[row][col]) {
            return;
        }

        if (row < maze.length - 1) {
            printPath3(p + "D", maze, row + 1, col);
        }

        if (col < maze[0].length - 1) {
            printPath3(p + "R", maze, row, col + 1);
        }
    }
}
