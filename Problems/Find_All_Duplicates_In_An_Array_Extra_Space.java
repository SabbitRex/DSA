# https://leetcode.com/problems/find-all-duplicates-in-an-array/

class Find_All_Duplicates_In_An_Array_Extra_Space {
    
    public List<Integer> findDuplicates(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        
        List<Integer> list = new ArrayList<>();
        
        for (int num : nums) {
            
            if (set.contains(num)) {
                
                list.add(num);
                
            } else {
                
                set.add(num);
            }
        }
        
        return list;
    }
}
