class Missing_Number {
    
    public int missingNumber(int[] nums) {
        
        int count = nums.length;
        
        int upperLimit = count;
        
        int missingNumber = 0;
        
        for (int i=upperLimit; i>0; i--) {
            
            boolean isPresent = false;
            
            for (int j=0; j<count; j++) {
                    
                if (nums[j] == i) {
                    
                    isPresent = true;
                }
            }
            
            if (!isPresent) {
                
                missingNumber = i;
                break;
            }
        }
        
        return missingNumber;
    }
}
