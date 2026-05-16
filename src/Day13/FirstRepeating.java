package Day13;

import java.util.*;

public class FirstRepeating {
    public static void main(String[] args) {

        int[] arr = {10, 5, 3, 4, 3, 5, 6};

        Set<Integer> set = new HashSet<>();

        int firstRepeating = -1;

        for (int i = arr.length - 1;
             i >= 0;
             i--) {

            if (set.contains(arr[i])) {

                firstRepeating = arr[i];
            }

            set.add(arr[i]);
        }

        System.out.println(
                "First Repeating: "
                        + firstRepeating
        );
    }
}
