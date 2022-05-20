class RemoveElement {
  
    public int removeElement(int[] nums, int val) {
        
        int size = nums.length;
        int i = 0;
        int j = size-1;
        
        while (i <= j) {
            
            if (nums[i] == val && nums[j] != val) {
                
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
                j--;
                
            } else if (nums[j] ==  val) {
                
                j--;
                
            } else {
            	
            	i++;
            }
        }
        
        return i;
    }
}
