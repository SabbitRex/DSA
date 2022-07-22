# https://leetcode.com/problems/set-mismatch/

class Set_Mismatch_Hashmap {
    
    public int[] findErrorNums(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        int[] result = new int[2];
        
        for (int i=0; i<nums.length; i++) {
            
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        for (int i=1; i<=nums.length; i++) {
            
            if (map.get(i) == null) {
                
                result[1] = i;
            }
            
            if (map.get(i)!= null && map.get(i) > 1) {
                
                result[0] = i;
            }
        }
        
        return result;
    }
}
