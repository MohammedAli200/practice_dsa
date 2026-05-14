package Day11;

import java.util.*;

public class PairWithDifference {
    public static void main(String[] args) {

        int[] arr = {1, 5, 3, 4, 2};
        int diff = 2;

        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        for (int num : arr) {

            if (set.contains(num + diff)) {

                System.out.println(num
                        + " "
                        + (num + diff));
            }
        }
    }
}