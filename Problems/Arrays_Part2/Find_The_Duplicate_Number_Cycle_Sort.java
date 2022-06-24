# https://leetcode.com/problems/find-the-duplicate-number/

class Find_The_Duplicate_Number_Cycle_Sort {
    
    public int findDuplicate(int[] nums) {
    
        int duplicateNum = 0;
        
        for (int i=0; i<nums.length; i++) {
            
            while (nums[i] != nums[nums[i] - 1] && nums[i] <= nums.length) {
                
            	int temp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = temp;
            }
        }
        
        for (int i=0; i<nums.length; i++) {
            
            if (nums[i]-1 != i) {
                
                duplicateNum = nums[i];
                break;
            }
        }
        
        return duplicateNum;
    }
}
