package Day4;

import java.util.*;

public class PairSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            int diff = target - num;

            if (set.contains(diff)) {
                System.out.println(diff + " + " + num + " = " + target);
            }

            set.add(num);
        }
    }
}