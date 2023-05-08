package backtracking;

import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

//        printAllPaths("", maze, 0,0);
        printAllPaths2("", maze, 0,0,new int[maze.length][maze[0].length], 1);

    }

    static void printAllPaths(String p, boolean[][] maze, int row, int col) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[row][col]) {
            return;
        }

        maze[row][col] = false;

        if (row < maze.length - 1) {
            printAllPaths(p + 'D', maze, row + 1, col);
        }

        if (col < maze[0].length - 1) {
            printAllPaths(p + 'R',maze, row, col+1);
        }

        if (row > 0){
            printAllPaths(p + 'U', maze, row - 1, col );
        }

        if (col > 0) {
            printAllPaths(p + 'L', maze, row, col - 1);
        }

        maze[row][col] = true;
    }

    static void printAllPaths2(String p, boolean[][] maze, int row, int col, int[][] steps, int count) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            steps[row][col] = count;
            for (int[] step : steps) {
                System.out.println(Arrays.toString(step));
            }
            System.out.println(p);
            return;
        }

        if (!maze[row][col]) {
            return;
        }

        maze[row][col] = false;
        steps[row][col] = count;

        if (row < maze.length - 1) {
            printAllPaths2(p + 'D', maze, row + 1, col, steps, count + 1);
        }

        if (col < maze[0].length - 1) {
            printAllPaths2(p + 'R',maze, row, col+1, steps, count + 1);
        }

        if (row > 0){
            printAllPaths2(p + 'U', maze, row - 1, col, steps, count + 1 );
        }

        if (col > 0) {
            printAllPaths2(p + 'L', maze, row, col - 1, steps, count + 1);
        }

        maze[row][col] = true;
        steps[row][col] = 0;
    }
}
