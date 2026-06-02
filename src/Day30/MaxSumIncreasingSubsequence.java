package Day30;

public class MaxSumIncreasingSubsequence {

    public static void main(String[] args) {

        int[] arr = {1,101,2,3,100,4,5};

        int n = arr.length;

        int[] dp = new int[n];

        int max = 0;

        for (int i = 0; i < n; i++) {

            dp[i] = arr[i];

            for (int j = 0; j < i; j++) {

                if (arr[i] > arr[j]) {

                    dp[i] = Math.max(
                            dp[i],
                            dp[j] + arr[i]
                    );
                }
            }

            max = Math.max(max, dp[i]);
        }

        System.out.println(max);
    }
}