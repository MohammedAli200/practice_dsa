package Day14;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {

        int[] arr = {10, 9, 2, 5, 3, 7, 101, 18};

        int[] dp =
                new int[arr.length];

        int maxLength = 1;

        for (int i = 0;
             i < arr.length;
             i++) {

            dp[i] = 1;

            for (int j = 0;
                 j < i;
                 j++) {

                if (arr[i] > arr[j]) {

                    dp[i] =
                            Math.max(dp[i],
                                    dp[j] + 1);
                }
            }

            maxLength =
                    Math.max(maxLength,
                            dp[i]);
        }

        System.out.println(
                "LIS Length: "
                        + maxLength
        );
    }
}