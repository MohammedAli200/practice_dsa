package Day40;

public class MatrixChainMultiplication {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        int n = arr.length;

        int[][] dp =
                new int[n][n];

        for (int len = 2;
             len < n;
             len++) {

            for (int i = 1;
                 i < n - len + 1;
                 i++) {

                int j = i + len - 1;

                dp[i][j] =
                        Integer.MAX_VALUE;

                for (int k = i;
                     k < j;
                     k++) {

                    dp[i][j] =
                            Math.min(
                                    dp[i][j],
                                    dp[i][k]
                                            + dp[k + 1][j]
                                            + arr[i - 1]
                                            * arr[k]
                                            * arr[j]
                            );
                }
            }
        }

        System.out.println(
                dp[1][n - 1]
        );
    }
}