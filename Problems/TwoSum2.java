class TwoSum2 {
    
    public int[] twoSum(int[] nums, int target) {
        
        int i = 0;
        int j = i + 1;
        
        int size = nums.length;
        
        int[] result = new int[2];
        
        while (i < j) {
            
            int fixed = nums[i];
            int moving = nums[j];
            
            int sum = fixed + moving;
             
            if (target == sum) {
                
                result[0] = i;
                result[1] = j;
                
                break;
                
            } else {
                
                j++;
            }
            
            if (j == size && i < size - 1) {
                
                i++;
                j = i + 1;
            }
        }
        
        return result;
    }
}
