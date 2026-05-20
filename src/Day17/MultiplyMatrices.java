package Day17;

public class MultiplyMatrices {
    public static void main(String[] args) {

        int[][] matrix1 = {
                {1, 2},
                {3, 4}
        };

        int[][] matrix2 = {
                {5, 6},
                {7, 8}
        };

        int rows = matrix1.length;
        int cols = matrix2[0].length;

        int[][] result =
                new int[rows][cols];

        for (int i = 0;
             i < rows;
             i++) {

            for (int j = 0;
                 j < cols;
                 j++) {

                for (int k = 0;
                     k < matrix2.length;
                     k++) {

                    result[i][j] +=
                            matrix1[i][k]
                                    * matrix2[k][j];
                }
            }
        }

        for (int[] row : result) {

            for (int num : row) {

                System.out.print(
                        num + " "
                );
            }

            System.out.println();
        }
    }
}