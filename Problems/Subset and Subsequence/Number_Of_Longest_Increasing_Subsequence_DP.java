# https://leetcode.com/problems/number-of-longest-increasing-subsequence/

class Number_Of_Longest_Increasing_Subsequence_DP {
    
    public int findNumberOfLIS(int[] nums) {
        
        int maxLength = 1;
        
        int[] dp = new int[nums.length];
        int[] count = new int[nums.length];
        
        Arrays.fill(dp, 1);
        Arrays.fill(count, 1);
        
        for (int i=1; i<nums.length; i++) {
            
            for (int j=0; j<i; j++) {
                
                if (nums[i] > nums[j] && dp[i] < dp[j] + 1) {
                    
                    dp[i] = dp[j] + 1;
                    count[i] = count[j];
                    
                } else if (nums[i] > nums[j] && dp[i] == dp[j] + 1) {
                	
                	count[i] = count[i] + count[j];
                }
            }
            
            maxLength = Math.max(dp[i], maxLength);
        }
        
        int result = 0;
        
        for (int i=0; i<nums.length; i++) {
            
            if (dp[i] == maxLength) {
                
            	result = result + count[i];
            }
        }
        
        return result;
    }
}
