# https://leetcode.com/problems/next-permutation/

class Next_Permutation_Two_Pointer {
    
    public void nextPermutation(int[] nums) {
        
        if (nums.length <= 1 || nums == null) {
            
            return;
        }
        
        int current = nums.length - 2;
        
        while (current >= 0 && nums[current] >= nums[current + 1]) {
            
            current--;
        }
        
        if (current >= 0) {
            
            int newCurrent = nums.length - 1;
            
            while (nums[current] >= nums[newCurrent]) {
            
                newCurrent--;
            }
            
            int temp = nums[current];
            nums[current] = nums[newCurrent];
            nums[newCurrent] = temp;
        }
        
        int swapFrom = current + 1;
        int swapTo = nums.length - 1;
        
        while (swapFrom < swapTo) {
            
            int temp = nums[swapFrom];
            nums[swapFrom] = nums[swapTo];
            nums[swapTo] = temp;
            
            swapFrom++;
            swapTo--;
        }
    }
}
