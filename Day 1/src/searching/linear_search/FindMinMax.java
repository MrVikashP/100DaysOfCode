package searching.linear_search;

public class FindMinMax {
    public static void main(String[] args) {
        int[] arr = {2, 90, 34, 23, 7, 89, 10};
        System.out.println(printMax(arr));
        System.out.println(printMin(arr));
    }

    static int printMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    static int printMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;

    }
}
