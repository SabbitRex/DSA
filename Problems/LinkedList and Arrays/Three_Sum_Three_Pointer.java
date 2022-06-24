# https://leetcode.com/problems/3sum/

class Three_Sum_Three_Pointer {
    
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        
        Arrays.sort(nums);
        
        for (int i=0; i<nums.length; i++) {
            
            if (i > 0 && nums[i] == nums[i - 1]) {
				
				continue;
			}
            
            int j = i + 1;
            
            int k = nums.length - 1;
            
            while (j < k) {
                
                int sum = nums[i] + nums[j] + nums[k];
                
                if (sum == 0) {
                    
                    List<Integer> local = new ArrayList<Integer>();
                    
                    local.add(nums[i]);
                    local.add(nums[j]);
                    local.add(nums[k]);
                    
                    result.add(local);
                    
                    k--;
                    
                    while (j < k && nums[k] == nums[k+1]) {
                        
                        k--;
                    }
                    
                    while (j < k && nums[j] == nums[j+1]) {
                        
                        j++;
                    }
                    
                } else if (sum > 0) {
                    
                    k--;
                    
                } else {
                    
                    j++;
                }
            }
        }
        
        return result;
    }
}
