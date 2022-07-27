# https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

class Best_Day_To_Sell_Stock {
    
    public int maxProfit(int[] p) {
        
		int globalMax = Integer.MIN_VALUE;
		
		int ptr = 1;
		
		int min = p[0];
		
		while (ptr < p.length) {
			
			int localProfit = p[ptr] - min;
			
			if (min > p[ptr]) {
				
				min = p[ptr];
			}
			
			ptr++;
			
			globalMax = Math.max(globalMax, localProfit);
		}
		
		if (globalMax < 0) {
			
			return 0;
		}
		
		return globalMax;
    }
}
