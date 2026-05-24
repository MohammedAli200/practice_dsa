package Day21;

public class ReplaceEvenOdd {
    public static void main(String[] args) {

        int[][] matrix = {
                {2, 4, 6},
                {1, 3, 5},
                {8, 10, 12}
        };

        for (int i = 0;
             i < matrix.length;
             i++) {

            for (int j = 0;
                 j < matrix[i].length;
                 j++) {

                if (matrix[i][j] % 2 == 0) {

                    matrix[i][j] += 1;
                }
            }
        }

        for (int[] row : matrix) {

            for (int num : row) {

                System.out.print(
                        num + " "
                );
            }

            System.out.println();
        }
    }
}