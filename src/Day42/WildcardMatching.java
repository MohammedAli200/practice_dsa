package Day42;

public class WildcardMatching {

    public static void main(String[] args) {

        String text = "adceb";
        String pattern = "*a*b";

        int n = text.length();
        int m = pattern.length();

        boolean[][] dp =
                new boolean[n + 1][m + 1];

        dp[0][0] = true;

        for (int j = 1; j <= m; j++) {

            if (pattern.charAt(j - 1) == '*') {

                dp[0][j] = dp[0][j - 1];
            }
        }

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= m; j++) {

                char p = pattern.charAt(j - 1);

                if (p == '*') {

                    dp[i][j] =
                            dp[i - 1][j]
                                    || dp[i][j - 1];

                } else if (p == '?'
                        || p == text.charAt(i - 1)) {

                    dp[i][j] =
                            dp[i - 1][j - 1];
                }
            }
        }

        System.out.println(dp[n][m]);
    }
}