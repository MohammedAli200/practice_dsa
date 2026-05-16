package Day13;

import java.util.*;

public class FirstNonRepeating {
    public static void main(String[] args) {

        int[] arr = {9, 4, 9, 6, 7, 4};

        Map<Integer, Integer> map =
                new LinkedHashMap<>();

        for (int num : arr) {

            map.put(num,
                    map.getOrDefault(num, 0) + 1);
        }

        for (int key : map.keySet()) {

            if (map.get(key) == 1) {

                System.out.println(
                        "First Non-Repeating: "
                                + key
                );

                break;
            }
        }
    }
}