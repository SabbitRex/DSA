# https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

class Find_All_Numbers_Disappeared_In_An_Array {
    
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> result = new ArrayList<>();
        
        int idx = 1;
        
        while (idx <= nums.length) {
            
            while (idx != nums[idx - 1] && nums[idx - 1] != nums[nums[idx - 1] - 1]) {
                
                int temp = nums[nums[idx - 1] - 1];
                nums[nums[idx - 1] - 1] = nums[idx - 1];
                nums[idx - 1] = temp;
            }
            
            idx++;
        }
        
        for (int i=1; i<=nums.length; i++) {
            
            if (nums[i-1] != i) {
                
                result.add(i);
            }
        }
        
        return result;
    }
}
