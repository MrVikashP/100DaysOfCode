package binarySearch;

public class FloorElement {
    public static void main(String[] args) {
        int[] nums = {2,3,5,7,9,11,15,17,19,20};

        System.out.println(getFloor(nums, 21));


    }

    static int getFloor(int[] nums, int target) {

        int s = 0;
        int e = nums.length - 1;

        if (target < nums[s]) {
            return -1;
        }

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (target > nums[mid]) {
                s = mid + 1;
            }

            else if (target < nums[mid]) {
                e = mid - 1;
            }

            else return nums[mid];
        }

        return nums[e];

    }
}
