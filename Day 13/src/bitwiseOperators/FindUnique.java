package bitwiseOperators;

public class FindUnique {
    public static void main(String[] args) {
        int[] nums = {4,3,7,2,4,2,7,6,3};
        System.out.println(getUnq(nums));
    }

    static int getUnq(int[] nums) {
        int uniq = 0;

        for (int i : nums) {
            uniq ^= i;
        }

        return uniq;
    }
}
