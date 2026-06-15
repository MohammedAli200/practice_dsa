package Day42;

public class RegexMatching {

    public static void main(String[] args) {

        String text = "aab";
        String pattern = "c*a*b";

        int n = text.length();
        int m = pattern.length();

        boolean[][] dp =
                new boolean[n + 1][m + 1];

        dp[0][0] = true;

        for (int j = 2; j <= m; j++) {

            if (pattern.charAt(j - 1) == '*') {

                dp[0][j] = dp[0][j - 2];
            }
        }

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= m; j++) {

                char p = pattern.charAt(j - 1);

                if (p == '.') {

                    dp[i][j] =
                            dp[i - 1][j - 1];

                } else if (p == '*') {

                    dp[i][j] =
                            dp[i][j - 2];

                    if (pattern.charAt(j - 2)
                            == '.'
                            || pattern.charAt(j - 2)
                            == text.charAt(i - 1)) {

                        dp[i][j] =
                                dp[i][j]
                                        || dp[i - 1][j];
                    }

                } else if (p
                        == text.charAt(i - 1)) {

                    dp[i][j] =
                            dp[i - 1][j - 1];
                }
            }
        }

        System.out.println(dp[n][m]);
    }
}