# https://leetcode.com/problems/find-all-duplicates-in-an-array/

class Find_All_Duplicates_In_An_Array_Constant_Space {
    
    public List<Integer> findDuplicates(int[] nums) {
        
        for (int i=1; i<=nums.length; i++) {
            
            while (i != nums[i-1] && nums[i-1] != nums[nums[i-1]-1]) {
                
                int temp = nums[nums[i-1]-1];
                nums[nums[i-1]-1] = nums[i-1];
                nums[i-1] = temp;
            }
        }
        
        List<Integer> result = new ArrayList<>();
        
        for (int i=1; i<=nums.length; i++) {
            
            if (nums[i-1] != i) {
                
                result.add(nums[i-1]);
            }
        }
        
        return result;
    }
}
