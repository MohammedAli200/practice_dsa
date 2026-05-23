package Day20;

import java.util.*;

public class MatrixToArray {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        int rows = matrix.length;
        int cols =
                matrix[0].length;

        int[] arr =
                new int[rows * cols];

        int index = 0;

        for (int[] row : matrix) {

            for (int num : row) {

                arr[index++] = num;
            }
        }

        System.out.println(
                Arrays.toString(arr)
        );
    }
}