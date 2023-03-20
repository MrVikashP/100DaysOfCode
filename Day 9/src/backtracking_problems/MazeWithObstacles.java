package backtracking_problems;

public class MazeWithObstacles {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };

        findPath("", maze, 0, 0);

    }

    static void findPath(String ans, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println( ans);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        if (r < maze.length - 1) {
            findPath(ans + 'D', maze, r + 1, c);
        }

        if (c < maze[0].length - 1) {
            findPath(ans + 'R', maze, r, c + 1);
        }
    }
}
