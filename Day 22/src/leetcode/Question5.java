package leetcode;

// https://leetcode.com/problems/check-if-it-is-a-straight-line/
public class Question5 {
    public static void main(String[] args) {
        int[][] values = {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
        System.out.println(checkStraightLine(values));

    }

    public static boolean checkStraightLine(int[][] coordinates) {
        int deltaY = getYDiff(coordinates[1], coordinates[0]);
        int deltaX = getXDiff(coordinates[1], coordinates[0]);

        for (int i = 2; i < coordinates.length; i++) {
            // Check if the slope between points 0 and i, is the same as between 0 and 1.
            if (deltaY * getXDiff(coordinates[i], coordinates[0])
                    != deltaX * getYDiff(coordinates[i], coordinates[0])) {
                return false;
            }
        }
        return true;

    }

    // Returns the delta Y.
     static int getYDiff(int[] a, int[] b) {
        return a[1] - b[1];
    }

    // Returns the delta X.
    static int getXDiff(int[] a, int[] b) {
        return a[0] - b[0];
    }
}
