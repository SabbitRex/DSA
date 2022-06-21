# https://leetcode.com/problems/subsets/

class Subsets_Recursion {
    
    List<List<Integer>> result = new ArrayList<>();
    
    public List<List<Integer>> subsets(int[] nums) {
        
        List<Integer> stack = new ArrayList<>();
        
        recurse(0, stack, nums);
        
        return result;
    }
    
    private void recurse(int currentIdx, List<Integer> stack, int[] nums) {
        
        result.add(new ArrayList<>(stack));
        
        for (int i=currentIdx; i<nums.length; i++) {
            
            stack.add(nums[i]);
            
            recurse(++currentIdx, stack, nums);
            
            stack.remove(stack.size()-1);
        }
    }
}
