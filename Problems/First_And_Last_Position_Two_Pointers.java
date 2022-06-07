class First_And_Last_Position_Two_Pointers {

    public int[] searchRange(int[] nums, int target) {
        
        int start = 0;
        int end = nums.length - 1;
        
        int[] result = new int[] {-1, -1};
        
        while (start <= end) {
            
            if (nums[start] == nums[end] && nums[start] == target) {
                
                result[0] =  start;
                result[1] = end;
                
                break;
                
            } else if (nums[start] == target && nums[end] != target) {
                
                end--;
                
            } else if (nums[start] != target && nums[end] == target) {
                
                start++;
                
            } else {
            	
            	start++;
            	end--;
            }
        }
        
        return result;
    }
}
