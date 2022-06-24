class Best_Day_To_Sell_Stock {
    
    public int maxProfit(int[] p) {
        
        int globalProfit = Integer.MIN_VALUE;
        
        int i = 0;
        int j = 1;
        
        boolean transactionDone = false;
        
        while (j < p.length) {
            
            int localProfit = p[j] - p[i];
            
            if (p[i] > p[j]) {
                
                i = j;
                j = i+1;
                
            } else {
                
                j++;
            }
            
            if (localProfit > globalProfit) {
                
                globalProfit = localProfit;
            }
        }
        
        if (globalProfit < 0) {
            
            return 0;
        }
        
        return globalProfit;
    }
}
