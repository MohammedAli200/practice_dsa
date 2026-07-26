package Day83;

import java.util.Scanner;

public class EditDistance {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        int[][] dp = new int[s1.length() + 1][s2.length() + 1];

        for (int i = 0; i <= s1.length(); i++) {

            for (int j = 0; j <= s2.length(); j++) {

                if (i == 0)
                    dp[i][j] = j;

                else if (j == 0)
                    dp[i][j] = i;

                else if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1];

                else {

                    dp[i][j] = 1 + Math.min(dp[i][j - 1],
                            Math.min(dp[i - 1][j],
                                    dp[i - 1][j - 1]));
                }
            }
        }

        System.out.println(dp[s1.length()][s2.length()]);
    }
}