class RemoveElementFromArray {
    
    public int search(int[] nums, int target) {
        
        int size = nums.length;
        
        if (target > nums[size - 1] && target < nums[0]) {
            
            return -1;
            
        } else if (target == nums[size-1]) {
            
            return size-1;
            
        } else if (target == nums[0]) {
            
            return 0;
            
        } else {
            
            for (int i = 1; i<size-1; i++) {
                
                if (nums[i] == target) {
                    
                    return i;
                }
            }
            
            return -1;
        }
    }
}
