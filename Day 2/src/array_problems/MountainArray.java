package array_problems;

// https://leetcode.com/problems/find-in-mountain-array/description/
public class MountainArray {
    public static void main(String[] args) {
        System.out.println("Solution is in the following code");
    }

//    public int findInMountainArray(int target, MountainArray mountainArr) {
//        // if we find the peak index means the max element then we can do binary search
//        // in two halves and can get the result.
//
//        int peakIndex = findPeak(mountainArr);
//
//        // mow search for the target
//        // first check in the left part of ascending order
//
//        int firstTry = search(mountainArr, target, 0, peakIndex);
//        if (firstTry != -1){
//            return firstTry;
//        }
//        return search(mountainArr, target, peakIndex + 1, mountainArr.length() - 1);
//    }
//
//    private int findPeak(MountainArray mountainArr){
//        int start = 0;
//        int last = mountainArr.length() - 1;
//
//        while (start < last){
//            int mid = start + (last - start) / 2;
//
//            if(mountainArr.get(mid) > mountainArr.get(mid + 1)){
//                last = mid;
//            }
//            else start = mid + 1;
//        }
//
//        return start;
//    }
//
//    private int search(MountainArray mountainArr, int target, int start, int last){
//        boolean isAsc = mountainArr.get(last) > mountainArr.get(start);
//        while(start <= last){
//            int mid = start + (last - start) / 2;
//
//            if (mountainArr.get(mid) == target){
//                return mid;
//            }
//            if (isAsc){
//                if (mountainArr.get(mid) > target){
//                    last = mid - 1;
//                }
//                else start = mid + 1;
//            }
//            else {
//                if (mountainArr.get(mid) > target){
//                    start = mid + 1;
//                }
//                else last = mid - 1;
//            }
//        }
//
//        return -1;
//    }
}
