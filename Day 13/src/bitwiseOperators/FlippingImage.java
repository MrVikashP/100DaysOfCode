package bitwiseOperators;

import java.util.Arrays;

public class FlippingImage {
    public static void main(String[] args) {
        int[][] image = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };

        // reverse and invert at the same time
        for (int[] row : image) {
            for (int i = 0; i <= (image[0].length) / 2; i++) {

                // swap
                int temp = row[i] ^ 1;
                row[i] = row[image[0].length - 1 -i] ^ 1;
                row[image[0].length - 1- i] = temp;
            }
        }

        // printing

        for (int[] row : image) {
            System.out.println(Arrays.toString(row));
        }


    }
}
