package recursion.general;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        diceThrow("", 4);

        System.out.println(diceRet("", 5));

    }

    static void diceThrow(String p, int target){
        if (target == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target ; i++) {
            diceThrow(p + i, target - i);

        }
    }

    static ArrayList<String> diceRet(String p, int target) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 1; i <= 6 && i <= target ; i++) {
            ans.addAll(diceRet(p + i, target - i));

        }

        return ans;


    }
}
