# https://leetcode.com/problems/running-sum-of-1d-array/

class Running_Sum_Of_1d_Array_1 {
    
    public int[] runningSum(int[] nums) {
        
        int currentSum = 0;
        
        for (int i=0; i<nums.length; i++) {
            
            currentSum = currentSum + nums[i];
            
            nums[i] = currentSum;
        }
        
        return nums;
    }
}
