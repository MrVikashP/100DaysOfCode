package searching.binary_search;

import java.util.Arrays;

public class BinarySearch2D {
    public static void main(String[] args) {
        // when the matrix is sorted row wise and col wise manner.
        // use findTarget Method.
        int[][] matrix = {
                {10,20,30,40},
                {11,25,34,45},
                {19,32,49,55},
                {33,39,55,59}
        };

        // when the matrix is sorted throughout.
        // use searchTarget method
        int[][] matrix1 = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
        };
        int target = 39;
        int target1 = 11;
        System.out.println(Arrays.toString(findTarget(matrix,target)));
        System.out.println(Arrays.toString(searchTarget(matrix1, target1)));
    }

    static int[] findTarget(int[][] matrix, int target){
        // decide the lower and upper bound
        int row = 0;
        int col = matrix.length-1;

        // start searching in the arr throughout
        while (row < matrix.length && col >= 0){
            // if the target gets equal the val then return the particular row and col values
            if (matrix[row][col] == target){
                return new int[]{row,col};
            }
            // if the value at the arr[row][col] is greater than the target then values which exists in that col can be
            // ignored because all value is greater than arr[row][col] so already greater than the target.
            else if (matrix[row][col] > target){
                col--;
            }
            // similarly that particular row will be ignored because all are less than arr[row][col] and the condition is
            // arr[row][col] < target
            else row++;
        }
        return new int[]{-1,-1};
    }

    static int[] searchTarget(int[][] matrix, int target){
        // finding rows length and col length
        int rows = matrix.length;
        int cols = matrix[0].length;

        // check if rows == 1
        if (rows == 1){
            return binarySearch(matrix, 0, 0, cols-1,target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        // at the end only two rows are remaining
        // have to eliminate rows more than 2
        while (rStart < (rEnd - 1)){
            // mid row
            int rMid = rStart + (rEnd - rStart) / 2;

            if (matrix[rMid][cMid] == target){
                return new int[]{rMid,cMid};
            }
            else if (matrix[rMid][cMid] > target){
                rEnd = rMid;
            }
            else rStart = rMid;

        }

        // checking for last two rows
        if (matrix[rStart][cMid] == target){
            return new int[]{rStart,cMid};
        }
        if (matrix[rStart+1][cMid] == target){
            return new int[]{rStart+1, cMid};
        }

        // check in first half
        if (matrix[rStart][cMid] > target){
            return binarySearch(matrix,rStart,0,cMid-1,target);
        }
        // check in second half
        if (matrix[rStart][cMid] < target && target <= matrix[rStart][cols-1]){
            return binarySearch(matrix,rStart,cMid+1,cols-1,target);
        }
        // check in third half
        if (matrix[rStart + 1][cMid] > target){
            return binarySearch(matrix,rStart + 1,0,cMid-1,target);
        }
        // check in fourth half
        if (matrix[rStart + 1][cMid] < target && target <= matrix[rStart + 1][cols-1]){
            return binarySearch(matrix,rStart + 1,cMid+1,cols-1,target);
        }

        return new int[] {-1,-1};
    }

    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while (cStart <= cEnd){
            int cMid = cStart + (cEnd - cStart) / 2;

            if (matrix[row][cMid] == target){
                return new int[]{row,cMid};
            }
            else if (matrix[row][cMid] > target){
                cEnd = cMid;
            }
            else {
                cStart = cMid + 1;
            }
        }
        return new int[]{-1,-1};
    }

}
