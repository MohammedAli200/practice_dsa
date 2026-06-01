package Day29;

import java.util.*;

public class FirstNonRepeatingElement {

    public static void main(String[] args) {

        int[] arr = {
                9, 4, 9, 6,
                7, 4
        };

        HashMap<Integer, Integer> map =
                new HashMap<>();

        for (int num : arr) {

            map.put(
                    num,
                    map.getOrDefault(num, 0) + 1
            );
        }

        for (int num : arr) {

            if (map.get(num) == 1) {

                System.out.println(
                        "First Non-Repeating = "
                                + num
                );

                return;
            }
        }
    }
}