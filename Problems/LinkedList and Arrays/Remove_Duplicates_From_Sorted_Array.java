# https://leetcode.com/problems/remove-duplicates-from-sorted-array/

class Remove_Duplicates_From_Sorted_Array {
    
    public int removeDuplicates(int[] nums) {
        
        if (nums.length == 1) {
            
            return 1;
        }
        
        int i=0;
        int j=1;
        
        while (i < nums.length) {
            
            if (nums[i] != nums[j]) {
                
                i++;
                nums[i] = nums[j];
                j++;
                
            } else {
                
                j++;
            }
            
            if (j == nums.length) {
            	
            	break;
            }
        }
        
        return i+1;
    }
}
