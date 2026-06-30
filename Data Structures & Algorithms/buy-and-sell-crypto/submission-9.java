class Solution {
    public int maxProfit(int[] prices) {
        int maxPrft=0;
        int minprc=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minprc) minprc=prices[i];
            else if(prices[i]-minprc>maxPrft) maxPrft=prices[i]-minprc;
        }
        return maxPrft;
    }
}