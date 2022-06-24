# https://leetcode.com/problems/max-consecutive-ones/

class Max_Consecutive_One {
    
    public int findMaxConsecutiveOnes(int[] nums) {
        
    	int localMax = 0;
    	
    	int i = 0;
    	
    	int globalMax = 0;
    	
    	int size = nums.length - 1;
    	
    	while (i <= size) {
    		
    		if (nums[i] == 1 ) {
    			
    			localMax++;
    			
    		} else {
    			
    			localMax = 0;
    		}
    		
    		if (localMax > globalMax) {
    			
    			globalMax = localMax;
    		}
            
            i++;
    	}
    	
    	return globalMax;
        
    }
}
