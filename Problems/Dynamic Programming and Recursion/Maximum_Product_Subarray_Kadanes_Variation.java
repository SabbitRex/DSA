# https://leetcode.com/problems/maximum-product-subarray/

class Maximum_Product_Subarray_Kadanes_Variation {
    
    public int maxProduct(int[] nums) {
        
        int globalMax = Integer.MIN_VALUE;
        
        // Set a max from left
        int localMaxLeft = 1;
        
        for (int i=0; i<nums.length; i++) {
            
            localMaxLeft = localMaxLeft * nums[i];
            
            globalMax = Math.max(globalMax, localMaxLeft);
            
            if(localMaxLeft == 0) {
                
                localMaxLeft = 1;
            }
        }
        
        // Set a max from right
        int localMaxRight = 1;
        
        for (int i=nums.length-1; i>=0; i--) {
            
            localMaxRight = localMaxRight * nums[i];
            
            globalMax = Math.max(globalMax, localMaxRight);
            
            if(localMaxRight == 0) {
                
                localMaxRight = 1;
            }
        }
        
        return globalMax;
    }
}
