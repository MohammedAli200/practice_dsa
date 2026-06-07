package Day34;

public class StockCooldown {

    public static void main(String[] args) {

        int[] prices = {1, 2, 3, 0, 2};

        int hold = -prices[0];
        int sold = 0;
        int rest = 0;

        for (int i = 1;
             i < prices.length;
             i++) {

            int prevSold = sold;

            sold = hold + prices[i];

            hold = Math.max(
                    hold,
                    rest - prices[i]
            );

            rest = Math.max(
                    rest,
                    prevSold
            );
        }

        System.out.println(
                Math.max(sold, rest)
        );
    }
}