package Day20;

public class MaximumRowSum {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {10, 20, 30},
                {4, 5, 6}
        };

        int maxSum = Integer.MIN_VALUE;
        int rowIndex = -1;

        for (int i = 0;
             i < matrix.length;
             i++) {

            int sum = 0;

            for (int j = 0;
                 j < matrix[i].length;
                 j++) {

                sum += matrix[i][j];
            }

            if (sum > maxSum) {

                maxSum = sum;
                rowIndex = i;
            }
        }

        System.out.println(
                "Row Index: "
                        + rowIndex
        );

        System.out.println(
                "Maximum Row Sum: "
                        + maxSum
        );
    }
}