class Solution {
    public int maxProfit(int[] prices) {
        int n =prices.length;
        int buy = prices[0];
        int maxprofit =0;
        for(int i=1; i<n; i++){
            if(prices[i]<buy){
                buy = prices[i];
            }
            int profit = prices[i]-buy;
            if(profit>maxprofit){
                maxprofit=profit;
            }

        }
        return maxprofit;
    }
}
