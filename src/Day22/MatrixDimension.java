package Day22;

public class MatrixDimension {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int rows = matrix.length;
        int cols =
                matrix[0].length;

        System.out.println(
                "Rows: "
                        + rows
        );

        System.out.println(
                "Columns: "
                        + cols
        );
    }
}
