package Day19;

import java.util.*;

public class SortRowsMatrix {
    public static void main(String[] args) {

        int[][] matrix = {
                {3, 1, 2},
                {9, 7, 8},
                {6, 4, 5}
        };

        for (int[] row : matrix) {
            Arrays.sort(row);
        }

        for (int[] row : matrix) {

            System.out.println(
                    Arrays.toString(row)
            );
        }
    }
}