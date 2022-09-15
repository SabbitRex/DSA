# https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

class Best_Day_To_Sell_Stock {
    
    public int maxProfit(int[] p) {
        
        int globalMaxProfit = Integer.MIN_VALUE;
        
        int localMaxProfit = 0;
        
        int min = prices[0];
        
        for (int i=1; i<prices.length; i++) {
            
            localMaxProfit = prices[i] - min;
            
            if (min > prices[i]) {
                
                min = prices[i];
            }
            
            globalMaxProfit = Math.max(globalMaxProfit, localMaxProfit);
        }
        
        if (globalMaxProfit < 0) {
			
			return 0;
		}
        
        return globalMaxProfit;
    }
}
