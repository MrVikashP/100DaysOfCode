package revision.searching;

public class NextGreatestChar {
    public static void main(String[] args) {
        char[] letters = {'a', 'c', 'g'};
        char target = 'k';

        System.out.println(getResult(letters, target));
    }

    static char getResult(char[] letters, char target) {
        int start = 0;
        int last = letters.length - 1;

        while (start <= last) {
            int mid = start + (last - start) / 2;

            if (target < letters[mid]) {
                last = mid - 1;
            }

            else start= mid + 1;
        }

        return letters[start % letters.length];
    }
}
