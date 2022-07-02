# https://leetcode.com/problems/maximum-product-subarray/

class Maximum_Product_Subarray_Brute_Force {
    
    public int maxProduct(int[] nums) {
        
        int globalMax = nums[0];
        
        for (int i=0; i<nums.length; i++) {
            
            int localMax = nums[i];
            
            for (int j=i+1; j<nums.length; j++) {
                
                globalMax = Math.max(localMax, globalMax);
                
                localMax = localMax * nums[j];
            }
            
            globalMax = Math.max(globalMax, localMax);
        }
        
        return globalMax;
    }
}
