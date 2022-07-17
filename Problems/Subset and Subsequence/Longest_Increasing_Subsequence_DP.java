# https://leetcode.com/problems/longest-increasing-subsequence/

class Longest_Increasing_Subsequence_DP {
    
    public int lengthOfLIS(int[] nums) {
        
        int[] dp = new int[nums.length];
        
        for (int i=0; i<dp.length; i++) {
            
            dp[i] = 1;    
        }
        
        int globalMax = 1;
        
        for (int i=1; i<nums.length; i++) {
            
            for (int j=0; j<i; j++) {
                
                if (nums[i] > nums[j]) {
                    
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
                
                globalMax = Math.max(dp[i], globalMax);
            }
        }
        
        return globalMax;
    }
}
