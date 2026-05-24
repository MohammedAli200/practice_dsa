package Day21;

public class ArrayToMatrix {
    public static void main(String[] args) {

        int[] arr = {
                1, 2, 3,
                4, 5, 6
        };

        int rows = 2;
        int cols = 3;

        int[][] matrix =
                new int[rows][cols];

        int index = 0;

        for (int i = 0;
             i < rows;
             i++) {

            for (int j = 0;
                 j < cols;
                 j++) {

                matrix[i][j] =
                        arr[index++];
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