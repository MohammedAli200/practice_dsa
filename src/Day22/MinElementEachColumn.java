package Day22;

public class MinElementEachColumn {
    public static void main(String[] args) {

        int[][] matrix = {
                {10, 2, 30},
                {4, 25, 6},
                {7, 18, 1}
        };

        for (int col = 0;
             col < matrix[0].length;
             col++) {

            int min =
                    matrix[0][col];

            for (int row = 1;
                 row < matrix.length;
                 row++) {

                min = Math.min(
                        min,
                        matrix[row][col]
                );
            }

            System.out.println(
                    "Column "
                            + col
                            + " Min: "
                            + min
            );
        }
    }
}