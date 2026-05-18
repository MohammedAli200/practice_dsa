package Day15;

import java.util.*;

public class SmallestPositiveMissing {
    public static void main(String[] args) {

        int[] arr = {0, -10, 1, 3, -20};

        Set<Integer> set =
                new HashSet<>();

        for (int num : arr) {

            if (num > 0) {
                set.add(num);
            }
        }

        int missing = 1;

        while (set.contains(missing)) {
            missing++;
        }

        System.out.println(
                "Smallest Missing: "
                        + missing
        );
    }
}