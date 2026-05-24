package Day21;

public class MaximumDiagonalElement {
    public static void main(String[] args) {

        int[][] matrix = {
                {11, 2, 3},
                {4, 25, 6},
                {7, 8, 19}
        };

        int max =
                matrix[0][0];

        for (int i = 0;
             i < matrix.length;
             i++) {

            max = Math.max(
                    max,
                    matrix[i][i]
            );
        }

        System.out.println(
                "Maximum Diagonal Element: "
                        + max
        );
    }
}