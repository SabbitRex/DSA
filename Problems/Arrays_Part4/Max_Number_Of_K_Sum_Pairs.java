# https://leetcode.com/problems/max-number-of-k-sum-pairs/

class Max_Number_Of_K_Sum_Pairs {
    
    public int maxOperations(int[] nums, int k) {
        
        Arrays.sort(nums);
        
        int left = 0;
        int right = nums.length - 1;
        
        int result = 0;
        
        while (left < right) {
            
            int sum = nums[left] + nums[right];
            
            if (sum == k) {
                
                result++;
                left++;
                right--;
                
            } else if (sum > k) {
                
                right--;
                
            } else {
                
                left++;
            }
        }
        
        return result;
    }
}
