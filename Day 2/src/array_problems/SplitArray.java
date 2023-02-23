package array_problems;

public class SplitArray {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int m = 2;
        int ans = splitArrayLargestSum(nums,m);
        System.out.println(ans);
    }

    static int splitArrayLargestSum(int[] nums, int m){
        // min answer = max in the array, we got it is when number of partition is size of the array.
        // max answer = sum of the array, we got it is when number of partition is 1;

        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }

        // now have the start and the end
        // got a range, can apply binary search
        while (start < end){
            // get mid value
            int mid = start + (end - start) / 2;

            // initialize count and sum equals 0;
            int count = 1, sum = 0;
            for (int i = 0; i < nums.length; i++) {
                // start adding values in the sum
                // till value is smaller or equal to mid
                sum += nums[i];
                // when is greater than mid, increment the count and make sum = 0;
                if (sum > mid){
                    sum = nums[i];
                    count++;
                }
            }

            // if number of count is less or equal to m
            // it can be a possible answer but check for lesser values if you can get .
            if (count <= m){
                end = mid;
            }
            // if number of count is greater than which is given that is m so have to less the number of count
            // so increase the value of mid and check for another value in the range.
            else start = mid + 1;

        }

        // above two checks will help us to achieve the min of maximum values in the subarray

        return start;  // start == end so can return anyone of them

    }
}
