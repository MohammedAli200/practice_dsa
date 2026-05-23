package Day20;

public class ReplaceBorderZero {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int rows = matrix.length;
        int cols =
                matrix[0].length;

        for (int i = 0;
             i < rows;
             i++) {

            for (int j = 0;
                 j < cols;
                 j++) {

                if (i == 0
                        || j == 0
                        || i == rows - 1
                        || j == cols - 1) {

                    matrix[i][j] = 0;
                }
            }
        }

        for (int[] row : matrix) {

            for (int num : row) {

                System.out.print(
                        num + " "
                );
            }

            System.out.println();
        }
    }
}