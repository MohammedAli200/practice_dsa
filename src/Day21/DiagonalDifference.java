package Day21;

public class DiagonalDifference {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {9, 8, 9}
        };

        int primary = 0;
        int secondary = 0;

        int n = matrix.length;

        for (int i = 0;
             i < n;
             i++) {

            primary += matrix[i][i];

            secondary +=
                    matrix[i][n - i - 1];
        }

        int difference =
                Math.abs(primary
                        - secondary);

        System.out.println(
                "Diagonal Difference: "
                        + difference
        );
    }
}