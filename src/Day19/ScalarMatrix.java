package Day19;

public class ScalarMatrix {
    public static void main(String[] args) {

        int[][] matrix = {
                {5, 0, 0},
                {0, 5, 0},
                {0, 0, 5}
        };

        boolean scalar = true;

        int diagonal =
                matrix[0][0];

        for (int i = 0;
             i < matrix.length;
             i++) {

            for (int j = 0;
                 j < matrix.length;
                 j++) {

                if (i == j
                        && matrix[i][j]
                        != diagonal) {

                    scalar = false;
                }

                if (i != j
                        && matrix[i][j] != 0) {

                    scalar = false;
                }
            }
        }

        System.out.println(
                scalar
                        ? "Scalar Matrix"
                        : "Not Scalar Matrix"
        );
    }
}