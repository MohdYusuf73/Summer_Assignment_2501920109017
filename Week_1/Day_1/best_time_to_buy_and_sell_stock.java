class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int profit = prices[0];
        for(int i=1;i<prices.length;i++)
        {
          maxProfit = Math.max(maxProfit,prices[i]-profit);
          profit = Math.min(profit,prices[i]);
        }
        return maxProfit;
    }
}