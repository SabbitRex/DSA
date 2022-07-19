class Maximum_Product_Subarray_DP {
    
    public int maxProduct(int[] nums) {
        
		// init a global max
        int globalMax = nums[0];
        
		// init a local max
        int localMax = nums[0];
         
		// init a local min
        int localMin = nums[0];
        
		// start from idx 1
        for (int i=1; i<nums.length; i++) {
            
			// store localMax in a temp value because you do not want to mess the localMax var for localMin operation
            int tempMax = Math.max(nums[i], Math.max(nums[i] * localMin, nums[i] * localMax));
            
            localMin = Math.min(nums[i], Math.min(nums[i] * localMin, nums[i] * localMax));
            
			// now set localMax with tempMax because localMax operation is done
            localMax = tempMax;
            
			// max of globalMax and localMax is result
            globalMax = Math.max(globalMax, localMax);
        }
        
        return globalMax;
    }
}
