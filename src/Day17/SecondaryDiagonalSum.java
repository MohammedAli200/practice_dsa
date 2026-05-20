package Day17;

public class SecondaryDiagonalSum {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sum = 0;
        int n = matrix.length;

        for (int i = 0;
             i < n;
             i++) {

            sum +=
                    matrix[i][n - i - 1];
        }

        System.out.println(
                "Secondary Diagonal Sum: "
                        + sum
        );
    }
}