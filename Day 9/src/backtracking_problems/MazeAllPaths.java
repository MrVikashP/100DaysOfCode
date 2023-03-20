package backtracking_problems;

import java.util.Arrays;

// Backtracking means the changes which is made while going down in the recursive calls should not be available when
// function gets returned for the future potential answer.
// Changes that have been made will not affect for other recursive calls
public class MazeAllPaths {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };

        getAllPath("", maze, 0, 0);

        int[][] path = new int[maze.length][maze[0].length];

        getAllPathPrint("", maze, 0,0,path,1);

    }

    static void getAllPath(String ans,boolean[][] maze, int row, int col) {
        // base condition
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(ans);
            return;
        }
        // if found any obstacles then return
        if (!maze[row][col]) {
            return;
        }

        // mark cell of the maze as false when traverse once for the recursive calls
        maze[row][col] = false;

        // moving down in the maze
        if (row < maze.length - 1) {
            getAllPath(ans + 'D', maze, row + 1, col );
        }

        // moving right in the maze
        if (col < maze[0].length - 1) {
            getAllPath(ans + 'R', maze, row, col + 1);
        }

        // moving left in the maze
        if (col > 0 ) {
            getAllPath(ans + 'L', maze, row, col - 1);
        }

        // moving up in the maze
        if (row > 0) {
            getAllPath(ans + 'U', maze, row - 1, col);
        }

        // this is the line where function gets over
        // so when function gets returned it should remove the changes made in that particular calls

        maze[row][col] = true;
    }

    static void getAllPathPrint(String ans,boolean[][] maze, int row, int col, int[][] path, int step) {
        // base condition
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            path[row][col] = step;
            for (int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(ans);
            System.out.println();
            return;
        }
        // if found any obstacles then return
        if (!maze[row][col]) {
            return;
        }

        // mark cell of the maze as false when traverse once for the recursive calls
        maze[row][col] = false;
        path[row][col] = step;

        // moving down in the maze
        if (row < maze.length - 1) {
            getAllPathPrint(ans + 'D', maze, row + 1, col, path, step + 1 );
        }

        // moving right in the maze
        if (col < maze[0].length - 1) {
            getAllPathPrint(ans + 'R', maze, row, col + 1, path, step + 1);
        }

        // moving left in the maze
        if (col > 0 ) {
            getAllPathPrint(ans + 'L', maze, row, col - 1, path, step + 1);
        }

        // moving up in the maze
        if (row > 0) {
            getAllPathPrint(ans + 'U', maze, row - 1, col, path, step + 1);
        }

        // this is the line where function gets over
        // so when function gets returned it should remove the changes made in that particular calls

        maze[row][col] = true;
        path[row][col] = 0;

    }
}
