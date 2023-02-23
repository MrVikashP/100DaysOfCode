package recursion_problems;

import java.util.ArrayList;
import java.util.List;

public class DiceThrow {
    // have to make as many combination to get the target
    public static void main(String[] args) {
        dice("", 4);
        System.out.println(diceRet("", 4));

    }

    static void dice(String p, int target) {
        if (target == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p + i, target - i);
        }
    }

    static List<String> diceRet(String p, int target) {
        // when un processed string is empty, print the processed one then return
        if (target == 0) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> result = new ArrayList<>();

        for (int i = 1; i <= 6 && i <= target; i++) {
            result.addAll(diceRet(p + i, target - i));
        }
        return result;
    }

}
