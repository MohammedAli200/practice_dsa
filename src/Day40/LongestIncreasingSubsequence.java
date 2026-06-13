package Day40;
public class LongestIncreasingSubsequence {

    public static void main(String[] args) {

        int[] arr = {10, 22, 9, 33, 21, 50, 41, 60};

        int n = arr.length;
        int[] dp = new int[n];

        int max = 1;

        for (int i = 0; i < n; i++) {

            dp[i] = 1;

            for (int j = 0; j < i; j++) {

                if (arr[j] < arr[i]) {

                    dp[i] = Math.max(
                            dp[i],
                            dp[j] + 1
                    );
                }
            }

            max = Math.max(max, dp[i]);
        }

        System.out.println(max);
    }
}