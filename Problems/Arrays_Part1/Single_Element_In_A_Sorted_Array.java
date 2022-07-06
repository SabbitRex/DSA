# https://leetcode.com/problems/single-element-in-a-sorted-array/

class Single_Element_In_A_Sorted_Array {
    
    public int singleNonDuplicate(int[] nums) {
        
        if (nums.length == 1) {
            
            return nums[0];
        }
        
        if(nums[nums.length - 1] != nums[nums.length - 2]) {
             
            return nums[nums.length - 1];
        }
        
        int result = 0;
        
        for (int i=0; i<nums.length; i++) {
            
            if (nums[i] == nums[i + 1]) {
                
                i = i + 1;
                
            } else {
                
                result = nums[i];
                break;
            }
        }
        
        return result;
    }
}
