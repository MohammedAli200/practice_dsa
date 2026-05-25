package Day22;

public class MatrixEquality {
    public static void main(String[] args) {

        int[][] matrix1 = {
                {1, 2},
                {3, 4}
        };

        int[][] matrix2 = {
                {1, 2},
                {3, 4}
        };

        boolean equal = true;

        for (int i = 0;
             i < matrix1.length;
             i++) {

            for (int j = 0;
                 j < matrix1[i].length;
                 j++) {

                if (matrix1[i][j]
                        != matrix2[i][j]) {

                    equal = false;
                }
            }
        }

        System.out.println(
                equal
                        ? "Matrices are Equal"
                        : "Matrices are Not Equal"
        );
    }
}