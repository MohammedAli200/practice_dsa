package Day22;

public class MaxElementEachColumn {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 20, 3},
                {14, 5, 16},
                {7, 18, 9}
        };

        for (int col = 0;
             col < matrix[0].length;
             col++) {

            int max =
                    matrix[0][col];

            for (int row = 1;
                 row < matrix.length;
                 row++) {

                max = Math.max(
                        max,
                        matrix[row][col]
                );
            }

            System.out.println(
                    "Column "
                            + col
                            + " Max: "
                            + max
            );
        }
    }
}