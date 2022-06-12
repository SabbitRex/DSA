# https://leetcode.com/problems/maximum-erasure-value/

class Maximum_Erasure_Value_Sliding_Window {
    
    public int maximumUniqueSubarray(int[] nums) {
        
        int windowLeft = 0;
        int windowRight = 0;
        
        int sum = 0;
        int maxEraseValue = 0;
        
        Set<Integer> set = new HashSet<>();
        
        while (windowRight < nums.length) {
            
            if (set.contains(nums[windowRight])) {
                
                sum = sum - nums[windowLeft];
                set.remove(nums[windowLeft]);
                windowLeft++;
                
            } else {
                
                sum = sum + nums[windowRight];
                set.add(nums[windowRight]);
                maxEraseValue = Math.max(maxEraseValue, sum);
                windowRight++;
            }
        }
        
        return maxEraseValue;
    }
}
