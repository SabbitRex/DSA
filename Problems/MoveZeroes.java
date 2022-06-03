# https://leetcode.com/problems/move-zeroes/

class MoveZeroes {
    
    public void moveZeroes(int[] nums) {
        
        int i = 0;
        int j = 0;
        
        while (i < nums.length) {
            
            if (nums[i] != 0) {
            	
            	i++;
            	j++;
            	
            } else if (nums[i] == 0 && nums[j] != 0) {
            	
            	nums[i] = nums[j];
            	nums[j] = 0;
            	
            	i++;
            	j++;
            	
            } else {
            	
            	j++;
            }
            
            if (j == nums.length) {
            	
            	return;
            }
        }
    }
}
