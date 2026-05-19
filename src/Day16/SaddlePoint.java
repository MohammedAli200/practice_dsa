package Day16;

public class SaddlePoint {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        boolean found = false;

        for (int i = 0;
             i < matrix.length;
             i++) {

            int minCol = 0;

            for (int j = 1;
                 j < matrix[i].length;
                 j++) {

                if (matrix[i][j]
                        < matrix[i][minCol]) {

                    minCol = j;
                }
            }

            int k;

            for (k = 0;
                 k < matrix.length;
                 k++) {

                if (matrix[k][minCol]
                        > matrix[i][minCol]) {

                    break;
                }
            }

            if (k == matrix.length) {

                found = true;

                System.out.println(
                        "Saddle Point: "
                                + matrix[i][minCol]
                );
            }
        }

        if (!found) {

            System.out.println(
                    "No Saddle Point"
            );
        }
    }
}