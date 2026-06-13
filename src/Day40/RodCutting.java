package Day40;

public class RodCutting {

    public static void main(String[] args) {

        int[] price = {
                1, 5, 8, 9,
                10, 17, 17, 20
        };

        int n = price.length;

        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < i; j++) {

                dp[i] = Math.max(
                        dp[i],
                        price[j]
                                + dp[i - j - 1]
                );
            }
        }

        System.out.println(dp[n]);
    }
}
