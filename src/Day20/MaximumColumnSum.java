package Day20;

public class MaximumColumnSum {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 20, 3},
                {4, 50, 6},
                {7, 80, 9}
        };

        int maxSum = Integer.MIN_VALUE;
        int columnIndex = -1;

        for (int i = 0;
             i < matrix[0].length;
             i++) {

            int sum = 0;

            for (int j = 0;
                 j < matrix.length;
                 j++) {

                sum += matrix[j][i];
            }

            if (sum > maxSum) {

                maxSum = sum;
                columnIndex = i;
            }
        }

        System.out.println(
                "Column Index: "
                        + columnIndex
        );

        System.out.println(
                "Maximum Column Sum: "
                        + maxSum
        );
    }
}