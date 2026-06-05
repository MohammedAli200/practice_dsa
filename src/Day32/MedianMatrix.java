package Day32;

import java.util.*;

public class MedianMatrix {

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 3, 5},
                {2, 6, 9},
                {3, 6, 9}
        };

        ArrayList<Integer> list =
                new ArrayList<>();

        for (int[] row : matrix) {

            for (int num : row) {

                list.add(num);
            }
        }

        Collections.sort(list);

        System.out.println(
                "Median = "
                        + list.get(
                        list.size() / 2
                )
        );
    }
}