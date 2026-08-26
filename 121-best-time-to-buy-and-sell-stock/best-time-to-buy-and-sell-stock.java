class Solution {
    public int maxProfit(int[] prices) {
        int mini=prices[0];
        int profit=0;
        for(int i=0;i<prices.length;i++){
            int maxi=prices[i]-mini;
            profit=Math.max(maxi,profit);
            mini=Math.min(prices[i],mini);
        }
        return profit;
    }
}