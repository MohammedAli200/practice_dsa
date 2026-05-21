package Day18;

public class ColumnSumMatrix {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0;
             i < matrix[0].length;
             i++) {

            int sum = 0;

            for (int j = 0;
                 j < matrix.length;
                 j++) {

                sum += matrix[j][i];
            }

            System.out.println(
                    "Column "
                            + i
                            + " Sum: "
                            + sum
            );
        }
    }
}