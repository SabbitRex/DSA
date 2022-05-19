class TwoSum1 {
    
    public int[] twoSum(int[] nums, int target) {
        
        int i = -1;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        int[] result = new int[2];
        
        for (int current : nums) {
            
            i++;
            
            if (map.containsKey(target - current)) {
                
                result[0] =  map.get(target - current);
                result[1] = i;
                
            } else {
                
                map.put(current, i);
            }
        }
        
        return result;
    }
}
