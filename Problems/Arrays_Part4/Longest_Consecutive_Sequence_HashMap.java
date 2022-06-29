# https://leetcode.com/problems/longest-consecutive-sequence/

class Longest_Consecutive_Sequence_HashMap {
    
    public int longestConsecutive(int[] nums) {
        
        Map<Integer, Boolean> map = new HashMap<>();
        
        // Set all map value to true 
        for (int num : nums) {
            
            map.put(num, true);
        }
        
        // Check if (num[idx]-1) is present in map, if yes, set false. At the end we will have elements which are possible starts.
        for (int i=0; i<nums.length; i++) {
            
            if (map.containsKey(nums[i]-1)) {
                
                map.put(nums[i], false);
            }
        }
        
        
        int globalMaxLength = 0;
        
        // Now for all element with value true, check if num+1 is present in map, if yes, keep adding 1 to local max length
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
