package Day29;

import java.util.*;

public class FirstRepeatingElement {

    public static void main(String[] args) {

        int[] arr = {
                10, 5, 3, 4,
                3, 5, 6
        };

        HashSet<Integer> set =
                new HashSet<>();

        int result = -1;

        for (int i = arr.length - 1;
             i >= 0;
             i--) {

            if (set.contains(arr[i])) {

                result = arr[i];

            } else {

                set.add(arr[i]);
            }
        }

        System.out.println(
                "First Repeating = "
                        + result
        );
    }
}