public class BuySellStocks {

    static int solve(int[] prices) {

        int previousBuyPrice = prices[0];
        int maxProfit = 0;
        int currentProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            int currentBuyPrice = prices[i];

            if (currentBuyPrice < previousBuyPrice) {
                previousBuyPrice = currentBuyPrice;
            }

            currentProfit = currentBuyPrice - previousBuyPrice;

            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int[] prices = { 7, 1, 5, 3, 6, 4 };

        int ans = solve(prices);

        System.out.println(ans);
    }
}
