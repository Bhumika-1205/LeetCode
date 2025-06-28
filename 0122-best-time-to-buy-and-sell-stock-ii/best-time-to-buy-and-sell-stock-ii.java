class Solution {
    public int maxProfit(int[] prices) {
         int j=prices[0],profit=0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i]>j){
                profit+=prices[i]-j;
            }
            j=prices[i];
        }
        return profit;
    }
}
