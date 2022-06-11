# https://leetcode.com/problems/missing-number/

class Missing_Number {
    
    public int missingNumber(int[] nums) {
        
        int sum = 0;
        
        int currentSum = 0;
        
        for (int i=0; i<=nums.length; i++) {
            
            sum = sum + i;
            
            if (i != nums.length) {
                
                currentSum = currentSum + nums[i];
            }
        }
        
        return sum - currentSum;
    }
}
