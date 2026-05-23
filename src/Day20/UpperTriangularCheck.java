package Day20;

public class UpperTriangularCheck {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {0, 5, 6},
                {0, 0, 9}
        };

        boolean upper = true;

        for (int i = 1;
             i < matrix.length;
             i++) {

            for (int j = 0;
                 j < i;
                 j++) {

                if (matrix[i][j] != 0) {
                    upper = false;
                }
            }
        }

        System.out.println(
                upper
                        ? "Upper Triangular Matrix"
                        : "Not Upper Triangular"
        );
    }
}