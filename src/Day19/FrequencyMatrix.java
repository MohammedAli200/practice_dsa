package Day19;

import java.util.*;

public class FrequencyMatrix {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 2},
                {3, 1, 4},
                {2, 4, 4}
        };

        Map<Integer, Integer> map =
                new HashMap<>();

        for (int[] row : matrix) {

            for (int num : row) {

                map.put(num,
                        map.getOrDefault(
                                num, 0
                        ) + 1);
            }
        }

        for (int key : map.keySet()) {

            System.out.println(
                    key + " -> "
                            + map.get(key)
            );
        }
    }
}