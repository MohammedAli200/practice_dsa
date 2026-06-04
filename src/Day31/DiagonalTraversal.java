package Day31;

public class DiagonalTraversal {

    public static void main(String[] args) {

        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int n = matrix.length;

        for (int d = 0; d < 2 * n - 1; d++) {

            int row =
                    d < n ? 0 : d - n + 1;

            int col =
                    d < n ? d : n - 1;

            while (row < n && col >= 0) {

                System.out.print(
                        matrix[row][col] + " "
                );

                row++;
                col--;
            }
        }
    }
}