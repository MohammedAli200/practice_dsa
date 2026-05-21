package Day18;

public class SparseMatrix {
    public static void main(String[] args) {

        int[][] matrix = {
                {0, 0, 3},
                {0, 0, 0},
                {1, 0, 0}
        };

        int zeroCount = 0;
        int total =
                matrix.length
                        * matrix[0].length;

        for (int[] row : matrix) {

            for (int num : row) {

                if (num == 0) {
                    zeroCount++;
                }
            }
        }

        if (zeroCount > total / 2) {

            System.out.println(
                    "Sparse Matrix"
            );

        } else {

            System.out.println(
                    "Not Sparse Matrix"
            );
        }
    }
}