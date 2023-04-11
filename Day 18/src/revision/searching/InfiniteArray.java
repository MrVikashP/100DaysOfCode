package revision.searching;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,99,121,145,178}; // should be infinite.
        int target = 10;
        System.out.println(search(nums, target));
    }

    static int search (int[] nums, int target) {
        int start = 0;
        int end = 1;

        while (target > nums[end]) {
            int temp = end + 1;

            end += (end - start + 1) * 2;

            start = temp;
        }

        return search2(nums, target);


    }

    static int search2 (int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            }
            else if (target > nums[mid]) {
                start = mid + 1;
            }

            else {
                return mid;
            }
        }

        return -1;
    }
}
