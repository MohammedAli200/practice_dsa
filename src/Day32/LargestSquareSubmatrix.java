package Day32;

public class LargestSquareSubmatrix {

    public static void main(String[] args) {

        int[][] matrix = {
                {0,1,1,0,1},
                {1,1,0,1,0},
                {0,1,1,1,0},
                {1,1,1,1,0},
                {1,1,1,1,1}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] dp =
                new int[rows][cols];

        int max = 0;

        for (int i = 0;
             i < rows;
             i++) {

            for (int j = 0;
                 j < cols;
                 j++) {

                if (i == 0 || j == 0) {

                    dp[i][j] =
                            matrix[i][j];

                } else if (
                        matrix[i][j] == 1) {

                    dp[i][j] =
                            Math.min(
                                    dp[i - 1][j],
                                    Math.min(
                                            dp[i][j - 1],
                                            dp[i - 1][j - 1]
                                    )
                            ) + 1;
                }

                max =
                        Math.max(
                                max,
                                dp[i][j]
                        );
            }
        }

        System.out.println(
                "Largest Square = "
                        + max
        );
    }
}