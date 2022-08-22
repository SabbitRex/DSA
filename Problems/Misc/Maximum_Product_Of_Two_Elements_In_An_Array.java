# https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/

class Maximum_Product_Of_Two_Elements_In_An_Array {
    
    public int maxProduct(int[] nums) {
        
        int currentMax = 0;
        int nextMax = 0;
        
        for (int i=0; i<nums.length; i++) {
            
            if (nums[i] > currentMax) {
                
                nextMax = currentMax;
                currentMax = nums[i];
                
            } else if (nums[i] > nextMax) {
                
                nextMax = nums[i];
            }
        }
        
        return (currentMax-1) * (nextMax-1);
    }
}
