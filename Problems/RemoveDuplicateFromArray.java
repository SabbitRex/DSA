class Solution {
    
    public int removeDuplicates(int[] nums) {
        
    	int unique = 0;
    	
    	for (int i=0; i<nums.length-1; i++) {
    		
    		if (nums[i] != nums[i+1]) {
    			
    			nums[unique] = nums[i];
    			unique++;
    		}
    	}
    	
    	nums[unique++] = nums[nums.length-1];
    	
        return unique;
    }
}
