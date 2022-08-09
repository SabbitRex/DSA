# https://leetcode.com/problems/climbing-stairs/

class Climbing_Stairs_Memorization {
    
    public int climbStairs(int n) {
        
        int[] dp = new int[n+1];
        
        Arrays.fill(dp, -1);
        
        return count(n, dp);
    }
    
    private int count(int sum, int[] dp) {
        
        if (sum < 0) {
            
            return 0;
        }
        
        if (sum == 0) {
            
            return 1;         
        }
        
        if (dp[sum] != -1) {
            
            return dp[sum];
        }
        
        int minusOne = count(sum - 1, dp);
        
        int minusTwo = count(sum - 2, dp);
        
        dp[sum] = minusOne + minusTwo;
        
        return dp[sum];
    }
}
