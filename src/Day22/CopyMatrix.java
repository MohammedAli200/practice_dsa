package Day22;

public class CopyMatrix {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2},
                {3, 4}
        };

        int[][] copy =
                new int[matrix.length]
                        [matrix[0].length];

        for (int i = 0;
             i < matrix.length;
             i++) {

            for (int j = 0;
                 j < matrix[i].length;
                 j++) {

                copy[i][j] =
                        matrix[i][j];
            }
        }

        for (int[] row : copy) {

            for (int num : row) {

                System.out.print(
                        num + " "
                );
            }

            System.out.println();
        }
    }
}