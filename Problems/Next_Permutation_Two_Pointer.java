# https://leetcode.com/problems/next-permutation/

class Next_Permutation_Two_Pointer {
    
    public void nextPermutation(int[] nums) {
        
        if (nums.length <= 1 || nums == null) {
            
            return;
        }
        
        int current = nums.length - 2;
        
        // Find first idx where nums[current] is less than nums[current+1]
        while (current >= 0 && nums[current] >= nums[current+1]) {
            
            current--;
        }
        
        // Find first bigger element than nums[current] from back
        if (current >= 0) {
            
            int c = nums.length-1;
            
            while (nums[current] >= nums[c]) {
                
                c--;
            }
            
            // Swap first bigger element from back and nums[current]
            int temp = nums[current];
            nums[current] = nums[c];
            nums[c] = temp;
        }
        
        int lastIdx = nums.length-1;
        int nextToCurrent = current+1;
        
        // Reverse nums[current+1] to last idx of array
        while (nextToCurrent < lastIdx) {
            
            int temp = nums[nextToCurrent];
            nums[nextToCurrent] = nums[lastIdx];
            nums[lastIdx] = temp;
            lastIdx--;
            nextToCurrent++;
        }
    }
}
