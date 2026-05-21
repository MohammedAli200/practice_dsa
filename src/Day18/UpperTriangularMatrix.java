package Day18;

public class UpperTriangularMatrix {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0;
             i < matrix.length;
             i++) {

            for (int j = 0;
                 j < i;
                 j++) {

                matrix[i][j] = 0;
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