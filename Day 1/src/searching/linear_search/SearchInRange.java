package searching.linear_search;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {2, -1, 34, 23, 7, 89, 10};
        System.out.println(doSearch(arr,10, 1, 4));

    }
    static int doSearch(int[] arr, int val, int start, int end){
        for (int i = start; i <= end; i++){
            if (val == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
