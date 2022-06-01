class SortColourDutchFlagAlgo {
    
    public void sortColors(int[] nums) {
        
        int L = 0;
        
        int M = 0;
        
        int H = nums.length - 1;
        
        while (M <= H) {
            
            if (nums[M] == 0) {
                
                int temp = nums[M];
                nums[M] = nums[L];
                nums[L] = temp;
                M++;
                L++;
                
            } else if (nums[M] == 1) {
                
                M++;
                
            } else {
                
                int temp = nums[M];
                nums[M] = nums[H];
                nums[H] = temp;
                H--;
            }
        }
    }
}
