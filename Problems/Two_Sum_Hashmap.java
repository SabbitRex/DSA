# https://leetcode.com/problems/two-sum/

class Two_Sum_Hashmap {
    
    public int[] twoSum(int[] nums, int target) {
            
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        int[] result = null;
        
        int idx = -1;
        
        for (int num : nums) {
            
            idx++;
            
            if (map.containsKey(target - num)) {
                
                result = new int[] {idx, map.get(target - num)};
                
            } else {
                
                map.put(num, idx);
            }
        }
        
        return result;
    }
}
