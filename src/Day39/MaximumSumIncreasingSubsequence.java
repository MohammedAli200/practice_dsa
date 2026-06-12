package Day39;

public class MaximumSumIncreasingSubsequence {

    public static void main(String[] args) {

        int[] arr = {1, 101, 2, 3, 100, 4, 5};

        int n = arr.length;

        int[] dp = new int[n];

        int maxSum = 0;

        for (int i = 0; i < n; i++) {

            dp[i] = arr[i];

            for (int j = 0; j < i; j++) {

                if (arr[j] < arr[i]) {

                    dp[i] =
                            Math.max(
                                    dp[i],
                                    dp[j] + arr[i]
                            );
                }
            }

            maxSum =
                    Math.max(
                            maxSum,
                            dp[i]
                    );
        }

        System.out.println(maxSum);
    }
}
