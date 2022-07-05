# https://leetcode.com/problems/max-consecutive-ones/

class Max_Consecutive_Ones {
    
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int globalMaxCount = 0;
        
        int localMaxCount = 0;
        
        for (int i=0; i<nums.length; i++) {
            
            if (nums[i] == 1) {
                
                localMaxCount++;
                
            }
            
            if (globalMaxCount < localMaxCount) {
                
                globalMaxCount = localMaxCount;
            }
            
            if (nums[i] == 0) {
                
                localMaxCount = 0;    
            } 
        }
        
        return globalMaxCount;
    }
}
