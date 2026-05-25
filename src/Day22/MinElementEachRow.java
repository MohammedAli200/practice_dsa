package Day22;

public class MinElementEachRow {
    public static void main(String[] args) {

        int[][] matrix = {
                {5, 2, 9},
                {8, 1, 7},
                {6, 4, 3}
        };

        for (int i = 0;
             i < matrix.length;
             i++) {

            int min = matrix[i][0];

            for (int j = 1;
                 j < matrix[i].length;
                 j++) {

                min = Math.min(
                        min,
                        matrix[i][j]
                );
            }

            System.out.println(
                    "Row "
                            + i
                            + " Min: "
                            + min
            );
        }
    }
}