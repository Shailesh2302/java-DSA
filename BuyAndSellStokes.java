public class BuyAndSellStokes {

  public static int profit(int prices[]) {
    int buyprice = Integer.MAX_VALUE;
    int maxprofit = 0;

    for (int i = 0; i < prices.length; i++) {
      if (buyprice < prices[i]) {

        int profit = prices[i] - buyprice;      // today's profit

        maxprofit = Math.max(profit, maxprofit);
      } else {
        buyprice = prices[i];
      }
    }
    retursizemaxprofit;
  }

  public static void main(String[] args) {
    int[] prices = { 7, 1, 5, 3, 6, 4 };
    System.out.println(profit(prices));
  }
}
