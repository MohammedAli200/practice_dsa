package Day19;

public class OrthogonalMatrix {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 0},
                {0, 1}
        };

        boolean orthogonal = true;

        for (int i = 0;
             i < matrix.length;
             i++) {

            for (int j = 0;
                 j < matrix.length;
                 j++) {

                int sum = 0;

                for (int k = 0;
                     k < matrix.length;
                     k++) {

                    sum +=
                            matrix[i][k]
                                    * matrix[j][k];
                }

                if ((i == j && sum != 1)
                        || (i != j && sum != 0)) {

                    orthogonal = false;
                }
            }
        }

        System.out.println(
                orthogonal
                        ? "Orthogonal Matrix"
                        : "Not Orthogonal"
        );
    }
}