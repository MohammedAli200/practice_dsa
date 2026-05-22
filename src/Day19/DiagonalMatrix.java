package Day19;

public class DiagonalMatrix {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 0, 0},
                {0, 5, 0},
                {0, 0, 9}
        };

        boolean diagonal = true;

        for (int i = 0;
             i < matrix.length;
             i++) {

            for (int j = 0;
                 j < matrix.length;
                 j++) {

                if (i != j
                        && matrix[i][j] != 0) {

                    diagonal = false;
                }
            }
        }

        System.out.println(
                diagonal
                        ? "Diagonal Matrix"
                        : "Not Diagonal Matrix"
        );
    }
}