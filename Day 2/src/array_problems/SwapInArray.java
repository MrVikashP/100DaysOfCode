package array_problems;

import java.util.Arrays;

public class SwapInArray {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        swap(num, 0, 4);
        System.out.println(Arrays.toString(num));
    }
    static void swap (int[] num, int index1, int index2 ){
        int temp = num[index1];
        num[index1] = num[index2];
        num[index2] = temp;
    }
}
