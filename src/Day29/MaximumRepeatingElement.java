package Day29;

import java.util.*;

public class MaximumRepeatingElement {

    public static void main(String[] args) {

        int[] arr = {
                1, 3, 2, 1,
                4, 1, 3, 1
        };

        HashMap<Integer, Integer> map =
                new HashMap<>();

        int maxFreq = 0;
        int element = arr[0];

        for (int num : arr) {

            int freq =
                    map.getOrDefault(num, 0) + 1;

            map.put(num, freq);

            if (freq > maxFreq) {

                maxFreq = freq;
                element = num;
            }
        }

        System.out.println(
                "Maximum Repeating Element = "
                        + element
        );
    }
}