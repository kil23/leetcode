class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        
        if(prices.length == 0) return 0;
        
        int bought = prices[0];
        for(int i=0; i<prices.length; i++) {
            if(prices[i]>bought) {
                if(result < prices[i]-bought) {
                    result = prices[i] - bought;
                }
            } else {
                bought = prices[i];
            }
        }
        return result;
    }
}