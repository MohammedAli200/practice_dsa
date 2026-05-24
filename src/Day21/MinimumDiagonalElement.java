package Day21;

public class MinimumDiagonalElement {
    public static void main(String[] args) {

        int[][] matrix = {
                {11, 2, 3},
                {4, 5, 6},
                {7, 8, 19}
        };

        int min =
                matrix[0][0];

        for (int i = 0;
             i < matrix.length;
             i++) {

            min = Math.min(
                    min,
                    matrix[i][i]
            );
        }

        System.out.println(
                "Minimum Diagonal Element: "
                        + min
        );
    }
}