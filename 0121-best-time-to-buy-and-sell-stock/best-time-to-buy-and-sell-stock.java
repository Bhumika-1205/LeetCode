class Solution {
    public int maxProfit(int[] prices) {
        int minValue=prices[0],profit=0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i]<minValue){
                minValue=prices[i];
            }
            else{
                profit=Math.max(prices[i]-minValue,profit);
            }
        }
        return profit;
    }
}
