package array_problems;

public class InfiniteNumbers {
    // There is given sorted array of infinite numbers
    // find the position of the element
    public static void main(String[] args) {
        // we can increase the length as much we want so call it a infinite array
        int[] nums = {2,3,4,5,6,7,8,9,11,23,24,25,26,27,29,32,33,45,65,89,98,100,101};
        int target = 23;
        System.out.println(findIndex(nums, target));
    }

    static int findIndex(int[] nums, int target){
        // start with the box of two
        int start = 0;
        int last = 1;

        // check it the target lies in the box, if not then double the size of the box.
        while (target > nums[last]){
            // new start
            int temp = last + 1;

            // new end
            last = last + (last - start + 1) * 2;

            start = temp;

        }
        return search(nums, target, start, last);

    }

    static int search(int[] nums, int target, int start, int last){

        while (start <= last){
            int mid = start + (last - start) / 2;

            if (nums[mid] == target){
                return mid;
            }
            else if (nums[mid] > target){
                last = mid - 1;
            }
            else start = mid + 1;
        }

        return -1;

    }
}
