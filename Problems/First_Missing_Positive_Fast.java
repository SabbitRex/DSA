# https://leetcode.com/problems/first-missing-positive/

class First_Missing_Positive_Fast {
    
    public int firstMissingPositive(int[] nums) {
        
        int size = nums.length;
        
        for (int i=0; i<size; i++) {
            
            //Ignore nums[i] = negative or more than size of nums array
            
            while (nums[i] > 0 && nums[i] <= size && nums[i] != nums[nums[i]-1]) {
            	
                int value = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = value;
            }
        }
        
        for (int i=0; i<size; i++) {
            
            if (nums[i] != i+1) {
                
                return i+1;
            }
        }
        
        return size+1;
    }
}
