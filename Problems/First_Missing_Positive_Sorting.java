# https://leetcode.com/problems/first-missing-positive/

class First_Missing_Positive_Sorting {
    
    public int firstMissingPositive(int[] nums) {
        
        int missingPositive = 1;
        
        Arrays.sort(nums);
        
        for (int num : nums) {
            
            if (num == missingPositive) {
                
                missingPositive++;
            }
        }
        
        return missingPositive;
    }
}
