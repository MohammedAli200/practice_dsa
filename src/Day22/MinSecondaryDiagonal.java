package Day22;

public class MinSecondaryDiagonal {
    public static void main(String[] args) {

        int[][] matrix = {
                {11, 2, 3},
                {4, 5, 6},
                {7, 8, 1}
        };

        int n = matrix.length;

        int min =
                matrix[0][n - 1];

        for (int i = 0;
             i < n;
             i++) {

            min = Math.min(
                    min,
                    matrix[i][n - i - 1]
            );
        }

        System.out.println(
                "Min Secondary Diagonal: "
                        + min
        );
    }
}