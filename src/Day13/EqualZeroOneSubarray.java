package Day13;

import java.util.*;

public class EqualZeroOneSubarray {
    public static void main(String[] args) {

        int[] arr = {0, 0, 1, 0, 1, 1, 0};

        Map<Integer, Integer> map =
                new HashMap<>();

        int sum = 0;
        int maxLength = 0;

        map.put(0, -1);

        for (int i = 0; i < arr.length; i++) {

            sum += (arr[i] == 0)
                    ? -1
                    : 1;

            if (map.containsKey(sum)) {

                maxLength =
                        Math.max(maxLength,
                                i - map.get(sum));

            } else {

                map.put(sum, i);
            }
        }

        System.out.println(
                "Maximum Length: "
                        + maxLength
        );
    }
}