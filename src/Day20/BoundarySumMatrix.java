package Day20;

public class BoundarySumMatrix {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sum = 0;

        int rows = matrix.length;
        int cols =
                matrix[0].length;

        for (int i = 0;
             i < rows;
             i++) {

            for (int j = 0;
                 j < cols;
                 j++) {

                if (i == 0
                        || j == 0
                        || i == rows - 1
                        || j == cols - 1) {

                    sum += matrix[i][j];
                }
            }
        }

        System.out.println(
                "Boundary Sum: "
                        + sum
        );
    }
}