package Day17;

public class IdentityMatrix {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };

        boolean identity = true;

        for (int i = 0;
             i < matrix.length;
             i++) {

            for (int j = 0;
                 j < matrix.length;
                 j++) {

                if (i == j
                        && matrix[i][j] != 1) {

                    identity = false;
                }

                if (i != j
                        && matrix[i][j] != 0) {

                    identity = false;
                }
            }
        }

        System.out.println(
                identity
                        ? "Identity Matrix"
                        : "Not Identity Matrix"
        );
    }
}