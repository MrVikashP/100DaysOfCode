package array_problems;

// https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class FindPeakIndex {
    public static void main(String[] args) {
        int[] arr = {0,2,3,1,0};
        int res = peakIndexInMountainArray(arr);
        System.out.println(res);
    }

    static int peakIndexInMountainArray(int[] arr) {
        // since array is bio tonic, it means array is divided into two parts one part is ascending order and other half is
        // descending order has to find the peak index that is the maximum in the array.
        int start = 0;
        int last = arr.length - 1;

        while (start < last){
            int mid = start + (last - start) / 2;

            // if the mid is greater than the next element then it may be the ans but possible answer may lie in the left
            if (arr[mid] > arr[mid+1]){
                last = mid;
            }
            // if the mid is smaller than next element then possible answer lie in the right part
            else start = mid + 1;
        }
        // since at the end start and end point to the same element and that will be the final answer since all the checks
        // will be made till this situation come so can return any of the start or last.
        return start;
    }
}
