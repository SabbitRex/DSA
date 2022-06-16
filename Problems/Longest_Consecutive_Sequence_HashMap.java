# https://leetcode.com/problems/longest-consecutive-sequence/

class Longest_Consecutive_Sequence_HashMap {
    
    public int longestConsecutive(int[] nums) {
        
        Map<Integer, Boolean> map = new HashMap<>();
        
        for (int num : nums) {
            
            map.put(num, true);
        }
        
        for (int i=0; i<nums.length; i++) {
            
            if (map.containsKey(nums[i]-1)) {
                
                map.put(nums[i], false);
            }
        }
        
        
        int globalMaxLength = 0;
        
        for (int i=0; i<nums.length; i++) {
            
            if (map.get(nums[i]) == true) {
                
                int localMaxLength = 1;
                
                int localStart = nums[i];
                
                while (map.containsKey(nums[i]+localMaxLength)) {
                    
                    localMaxLength++;
                }
                
                if (globalMaxLength < localMaxLength) {
                    
                    globalMaxLength = localMaxLength;
                }
            }
        }
        
        return globalMaxLength;
    }
}
