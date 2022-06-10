# https://leetcode.com/problems/find-the-duplicate-number/

class Find_The_Duplicate_Number_Floyds_Algorithm {
    
    public int findDuplicate(int[] nums) {
        
        int slowIdx = 0;
        
        int fastIdx = 0;
        
        while (true) {
            
            slowIdx = nums[slowIdx];
            fastIdx = nums[nums[fastIdx]];
            
            if (slowIdx == fastIdx) {
                
                int newSlowIdx = 0;
                
                while (true) {
                    
                    slowIdx = nums[slowIdx];
                    newSlowIdx = nums[newSlowIdx];
                    
                    if (slowIdx == newSlowIdx) {
                        
                        return slowIdx;
                    }
                }
            }
        }
    }
}
