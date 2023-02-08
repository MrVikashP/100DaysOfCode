package searching.binary_search;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] num1 = {-1,2,5,6,9,11,34,50};
        int[] num2 = {44,32,29,20,19,11,8,-34,-78};
        System.out.println(findTarget(num1,34));
        System.out.println(findTarget(num2, 32));
    }

    static int findTarget(int[] num, int target){
        int start = 0;
        int last = num.length -1;

        boolean isAsc = num[start] < num[last]; // check whether array in ascending or descending

        while (start <= last){
            int mid = start + (last - start) / 2;

            if (num[mid] == target) {
                return mid;
            }

            // perform action according to ascending or descending
            if (isAsc) {
                if (num[mid] > target){
                    last = mid;
                }
                else start = mid + 1;
            }
            else {
                if (num[mid] > target){
                    start = mid + 1;
                }
                else last = mid;
            }
        }
        return -1;
    }
}
