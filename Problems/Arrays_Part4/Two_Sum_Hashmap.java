# https://leetcode.com/problems/two-sum/

class Two_Sum_Hashmap {
    
    public int[] twoSum(int[] nums, int target) {
        
        int[] result = new int[2];
        
        Map<Integer, Integer> map = new HashMap<>();
        
        int idx = 0;
        
        for (int num : nums) {
            
            if (map.containsKey(target - num)) {
                
                result = new int[] {idx, map.get(target - num)};
                
                break;
                
            } else {
                
                map.put(num, idx);
            }
            
            idx++;
        }
        
        return result;
    }
}
