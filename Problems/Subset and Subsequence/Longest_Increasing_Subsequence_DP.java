# https://leetcode.com/problems/longest-increasing-subsequence/

class Longest_Increasing_Subsequence_DP {
    
    public int lengthOfLIS(int[] nums) {
        
        int result = 1;
        
        int[] dp = new int[nums.length];
        
        Arrays.fill(dp, 1);
        
        for (int i=1; i<nums.length; i++) {
            
            for (int j=0; j<i; j++) {
                
                if (nums[i] > nums[j]) {
                    
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            
            result = Math.max(dp[i], result);
        }
        
        return result;
    }
}
