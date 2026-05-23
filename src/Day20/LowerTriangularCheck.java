package Day20;

public class LowerTriangularCheck {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 0, 0},
                {4, 5, 0},
                {7, 8, 9}
        };

        boolean lower = true;

        for (int i = 0;
             i < matrix.length;
             i++) {

            for (int j = i + 1;
                 j < matrix.length;
                 j++) {

                if (matrix[i][j] != 0) {
                    lower = false;
                }
            }
        }

        System.out.println(
                lower
                        ? "Lower Triangular Matrix"
                        : "Not Lower Triangular"
        );
    }
}