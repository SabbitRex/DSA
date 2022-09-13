# https://leetcode.com/problems/next-permutation/

class Next_Permutation_Two_Pointer {
    
    public void nextPermutation(int[] nums) {
        
        if (nums.length <= 1 || nums == null) {
            
            return;
        }
        
        int current = nums.length - 2;
        
        while (current >=0 && nums[current] >= nums[current + 1]) {
            
            current--;
        }
        
        if (current >=0) {
            
            int idx = nums.length - 1;
            
            while (nums[current] >= nums[idx]) {
                
                idx--;
            }
            
            int temp = nums[current];
            nums[current] = nums[idx];
            nums[idx] = temp;
        }
        
        int swapStart = current + 1;
        int swapEnd = nums.length - 1;
        
        while (swapStart < swapEnd) {
            
            int temp = nums[swapStart];
            nums[swapStart] = nums[swapEnd];
            nums[swapEnd] = temp;
            
            swapStart++;
            swapEnd--;
        }
    }
}
