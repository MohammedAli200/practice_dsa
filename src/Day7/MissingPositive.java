package Day7;

import java.util.*;

public class MissingPositive {
    public static void main(String[] args) {

        int[] arr = {3, 4, -1, 1};

        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (num > 0) {
                set.add(num);
            }
        }

        int missing = 1;

        while (set.contains(missing)) {
            missing++;
        }

        System.out.println("First Missing Positive: " + missing);
    }
}