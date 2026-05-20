package Day17;

public class AddMatrices {
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
        int cols = matrix1[0].length;

        int[][] result =
                new int[rows][cols];

        for (int i = 0;
             i < rows;
             i++) {

            for (int j = 0;
                 j < cols;
                 j++) {

                result[i][j] =
                        matrix1[i][j]
                                + matrix2[i][j];
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