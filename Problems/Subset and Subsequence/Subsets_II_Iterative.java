# https://leetcode.com/problems/subsets-ii/

class Subsets_II_Iterative {
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        Set<List<Integer>> set = new HashSet<>();
        
        set.add(new ArrayList<>());
        
        Arrays.sort(nums);
        
        for (int num : nums) {
            
            List<List<Integer>> list = new ArrayList<>();
            
            for (List<Integer> L : set) {
                
                list.add(L);
            }
            
            for (int i=0; i<list.size(); i++) {
                
                List<Integer> temp = new ArrayList<>(list.get(i));
                temp.add(num);
                set.add(temp);
            }
        }
        
        List<List<Integer>> result = new ArrayList<>();
        
        for (List<Integer> L : set) {
                
            result.add(L);
        }
        
        return result;
    }
}
