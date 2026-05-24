package Day21;

public class ReverseColumnsMatrix {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int col = 0;
             col < cols;
             col++) {

            int top = 0;
            int bottom = rows - 1;

            while (top < bottom) {

                int temp =
                        matrix[top][col];

                matrix[top][col] =
                        matrix[bottom][col];

                matrix[bottom][col] =
                        temp;

                top++;
                bottom--;
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