# https://leetcode.com/problems/search-a-2d-matrix/

class Search_A_2D_Matrix_Binary_Search {
    
    public List<Integer> majorityElement(int[] nums) {
        
        List<Integer> result = new ArrayList<>();
        
        if (nums.length == 1) {
            
            result.add(nums[0]);
            
            return result;
        }
        
        int freq = nums.length/3;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int num : nums) {
            
            int count = 0;
            
            if (map.containsKey(num)) {
                
                count = map.get(num) + 1;
                
                map.put(num, count);
                
            } else {
                
                map.put(num, 1);
            }
        }
        
        for (Integer i : map.keySet()) {
            
            if (map.get(i) > nums.length/3) {
                
                result.add(i);
            }             
        }
        
        return result;
    }
}
