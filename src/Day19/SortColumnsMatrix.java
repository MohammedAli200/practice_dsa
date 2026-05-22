package Day19;

import java.util.*;

public class SortColumnsMatrix {
    public static void main(String[] args) {

        int[][] matrix = {
                {9, 3, 5},
                {6, 1, 8},
                {7, 2, 4}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int col = 0;
             col < cols;
             col++) {

            int[] temp = new int[rows];

            for (int row = 0;
                 row < rows;
                 row++) {

                temp[row] =
                        matrix[row][col];
            }

            Arrays.sort(temp);

            for (int row = 0;
                 row < rows;
                 row++) {

                matrix[row][col] =
                        temp[row];
            }
        }

        for (int[] row : matrix) {

            System.out.println(
                    Arrays.toString(row)
            );
        }
    }
}