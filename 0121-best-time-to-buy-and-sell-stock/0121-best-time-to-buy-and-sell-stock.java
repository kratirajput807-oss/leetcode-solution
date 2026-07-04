class Solution {
    public int maxProfit(int[] prices) {
        int buy_day= prices[0];
        int result=0;
        for(int i=1;i<prices.length;i++){
            int profit= prices[i]- buy_day;
            if(profit>result){
                result = profit;

            }
            buy_day= Math.min(prices[i],buy_day);

        }
        return result;
        
    }
}