class Find_Missing_Number {
    
    public int missingNumber(int[] nums) {
        
        int size = nums.length;
        
        int sum = 0;
        
        int sumNums = 0;
        
        for (int i=0; i<=size; i++) {
            
            sum = sum + i;
            
            if (i != size) {
                
                sumNums = sumNums + nums[i];
            }
        }
        
        return sum - sumNums;
    }
}
