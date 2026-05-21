package Day18;

public class SwapColumnsMatrix {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int col1 = 0;
        int col2 = 2;

        for (int i = 0;
             i < matrix.length;
             i++) {

            int temp =
                    matrix[i][col1];

            matrix[i][col1] =
                    matrix[i][col2];

            matrix[i][col2] =
                    temp;
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