class LonelyInteger {

    public List<Integer> findLonely(int[] nums) {
        
        List<Integer> result = new ArrayList<Integer>();
        
        int i=0;
        int j=1;
        int size = nums.length;
        
        while (i <size) {
            
        	int current = nums[i];
        	
        	int up = current + 1;
        	int down = current - 1;
        	
            if ((up == nums[j] || down == nums[j] || current == nums[j]) && i != j) {
                
                i++;
                j = 0;
                continue;
                
            } else {
            	
            	j++;
            }
            
            if (j == size) {
                
                result.add(nums[i]);
                i++;
                j = 0;
            }
        }
        
        return result;
    }
}
