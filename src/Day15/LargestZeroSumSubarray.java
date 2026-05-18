package Day15;

import java.util.*;

public class LargestZeroSumSubarray {
    public static void main(String[] args) {

        int[] arr =
                {15, -2, 2, -8, 1, 7, 10, 23};

        Map<Integer, Integer> map =
                new HashMap<>();

        int sum = 0;
        int maxLength = 0;

        for (int i = 0;
             i < arr.length;
             i++) {

            sum += arr[i];

            if (sum == 0) {

                maxLength = i + 1;
            }

            if (map.containsKey(sum)) {

                maxLength =
                        Math.max(maxLength,
                                i - map.get(sum));

            } else {

                map.put(sum, i);
            }
        }

        System.out.println(
                "Largest Length: "
                        + maxLength
        );
    }
}