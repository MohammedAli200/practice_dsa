package Day22;

public class MaxSecondaryDiagonal {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 30},
                {4, 25, 6},
                {17, 8, 9}
        };

        int n = matrix.length;

        int max =
                matrix[0][n - 1];

        for (int i = 0;
             i < n;
             i++) {

            max = Math.max(
                    max,
                    matrix[i][n - i - 1]
            );
        }

        System.out.println(
                "Max Secondary Diagonal: "
                        + max
        );
    }
}