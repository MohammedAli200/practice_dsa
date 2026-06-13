package Day40;

public class CoinChangeWays {

    public static void main(String[] args) {

        int[] coins = {1, 2, 5};

        int amount = 5;

        int[] dp = new int[amount + 1];

        dp[0] = 1;

        for (int coin : coins) {

            for (int i = coin;
                 i <= amount;
                 i++) {

                dp[i] += dp[i - coin];
            }
        }

        System.out.println(dp[amount]);
    }
}