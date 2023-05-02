package binarySearch;

public class NextGreatest {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'g'};
        char target = 'g';

        System.out.println(nextGreatestElement(letters, target));

    }

    static char nextGreatestElement(char[] letters, char target) {
        int s = 0;
        int e = letters.length - 1;

/*
        if (target >= letters[e]) {
            return letters[0];
        }
*/

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (target > letters[mid]) {
                s = mid + 1;
            }

            else e = mid - 1;
        }

        return letters[s % (letters.length - 1)];
    }
}
