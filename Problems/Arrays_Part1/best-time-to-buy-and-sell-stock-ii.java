# https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/ 

class Solution {
    public int maxProfit(int[] p) {
        
        if (p == null || p.length <= 0) {
            return 0;
        }
        
        int totalProfit = 0;
        
        for (int i=1; i<p.length; i++) {
            int yesterday = p[i-1];
            int today = p[i];
            int localProfit = today - yesterday;
            
            if (yesterday < today) {
                
                totalProfit = localProfit + totalProfit;
            }
        }
        
        return totalProfit;
    }
}
