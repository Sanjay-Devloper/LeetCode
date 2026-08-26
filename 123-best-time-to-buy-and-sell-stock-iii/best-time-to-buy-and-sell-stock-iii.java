class Solution {
    public int maxProfit(int[] prices) {
        int firstbuy=prices[0];
        int firstprofit=0;
        int secondbuy=prices[0];
        int secondprofit=0;
        for(int i=1;i<prices.length;i++){
            int price=prices[i];
            firstbuy=Math.min(firstbuy,price);
            firstprofit=Math.max(firstprofit,price-firstbuy);
            secondbuy=Math.min(secondbuy,price-firstprofit);
            secondprofit=Math.max(secondprofit,price-secondbuy);
        }
        return secondprofit;
    }
}