package Day22;

public class MaxElementEachRow {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 9, 3},
                {14, 5, 6},
                {7, 18, 2}
        };

        for (int i = 0;
             i < matrix.length;
             i++) {

            int max = matrix[i][0];

            for (int j = 1;
                 j < matrix[i].length;
                 j++) {

                max = Math.max(
                        max,
                        matrix[i][j]
                );
            }

            System.out.println(
                    "Row "
                            + i
                            + " Max: "
                            + max
            );
        }
    }
}