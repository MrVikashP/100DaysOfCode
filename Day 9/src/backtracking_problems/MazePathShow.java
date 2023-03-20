package backtracking_problems;

import java.util.ArrayList;

public class MazePathShow {
    public static void main(String[] args) {
        getPaths("", 3, 3);

        System.out.println(showPath("", 3,3));

        System.out.println(showPathDiagonal("", 3, 3));

    }

    static void getPaths(String p, int row, int col) {
        if (row == 1 && col == 1) {
            System.out.println(p);
            return;
        }

        if (row > 1) {
            getPaths(p + 'D', row - 1, col);
        }

        if (col > 1) {
            getPaths(p + 'R', row, col - 1);
        }
    }

    static ArrayList<String> showPath (String p, int row, int col) {
        if (row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list1 = new ArrayList<>();
        if (row > 1) {
            list1.addAll(showPath(p + 'D', row - 1, col));
        }

        if (col > 1) {
            list1.addAll(showPath(p + 'R', row, col - 1));
        }

        return list1;
    }

    static ArrayList<String> showPathDiagonal (String ans, int row, int col) {
        if (row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (row > 1 && col > 1) {
            list.addAll(showPathDiagonal(ans + 'd', row - 1, col - 1));
        }

        if (row > 1) {
            list.addAll(showPathDiagonal(ans + 'D', row - 1, col));
        }

        if (col > 1) {
            list.addAll(showPathDiagonal(ans + 'R', row, col - 1));
        }

        return list;
    }
}
