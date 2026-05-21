package Day18;

import java.util.*;

public class SwapRowsMatrix {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int row1 = 0;
        int row2 = 2;

        int[] temp = matrix[row1];
        matrix[row1] = matrix[row2];
        matrix[row2] = temp;

        for (int[] row : matrix) {

            System.out.println(
                    Arrays.toString(row)
            );
        }
    }
}