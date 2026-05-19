package Day16;

public class MaximumSumRectangle {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, -1, -4, -20},
                {-8, -3, 4, 2, 1},
                {3, 8, 10, 1, 3},
                {-4, -1, 1, 7, -6}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        int maxSum = Integer.MIN_VALUE;

        for (int left = 0;
             left < cols;
             left++) {

            int[] temp = new int[rows];

            for (int right = left;
                 right < cols;
                 right++) {

                for (int i = 0;
                     i < rows;
                     i++) {

                    temp[i] += matrix[i][right];
                }

                int currentSum = temp[0];
                int best = temp[0];

                for (int i = 1;
                     i < temp.length;
                     i++) {

                    currentSum =
                            Math.max(temp[i],
                                    currentSum + temp[i]);

                    best =
                            Math.max(best,
                                    currentSum);
                }

                maxSum =
                        Math.max(maxSum,
                                best);
            }
        }

        System.out.println(
                "Maximum Rectangle Sum: "
                        + maxSum
        );
    }
}