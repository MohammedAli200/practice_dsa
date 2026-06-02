package Day30;

import java.util.*;

public class LongestDecreasingSubsequence {

    public static void main(String[] args) {

        int[] arr = {9,8,7,3,2,1};

        int n = arr.length;

        int[] dp = new int[n];

        Arrays.fill(dp, 1);

        int max = 1;

        for (int i = 1; i < n; i++) {

            for (int j = 0; j < i; j++) {

                if (arr[i] < arr[j]) {

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