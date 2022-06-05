# https://leetcode.com/problems/sort-colors/

class Sort_Colour_Dutch_Flag_Algo {
    
    public void sortColors(int[] nums) {
        
        int left = 0;
        
        int mid = 0;
        
        int right = nums.length - 1;
        
        while (mid <= right) {
            
            if (nums[mid] == 0) {
                
                nums[mid] = nums[left];
                nums[left] = 0;
                left++;
                mid++;
                
            } else if (nums[mid] == 1) {
                
                mid++;
                
            } else {
                
                nums[mid] = nums[right];
                nums[right] = 2;
                right--;
            }
        }
    }
}
