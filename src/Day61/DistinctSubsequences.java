package Day61;

import java.util.Scanner;

public class DistinctSubsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int n = str.length();

        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            dp[i] = 2 * dp[i - 1];
        }

        System.out.println(dp[n]);
    }
}