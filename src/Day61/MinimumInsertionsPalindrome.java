package Day61;

import java.util.Scanner;

public class MinimumInsertionsPalindrome {

    static int lps(String str) {
        int n = str.length();
        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }

        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;

                if (str.charAt(i) == str.charAt(j)) {
                    dp[i][j] =
                            (len == 2) ? 2
                                    : dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] =
                            Math.max(dp[i + 1][j],
                                    dp[i][j - 1]);
                }
            }
        }

        return dp[0][n - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int ans = str.length() - lps(str);

        System.out.println(ans);
    }
}