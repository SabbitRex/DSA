# https://leetcode.com/problems/permutations-ii/

class Permutations_II_Hashset {
    
    Set<List<Integer>> set = new HashSet<>();
    
    public List<List<Integer>> permuteUnique(int[] nums) {
        
        boolean[] isTaken = new boolean[nums.length];
        
        Stack<Integer> stack = new Stack<>();
        
        find(stack, nums, isTaken);
        
        return new ArrayList<>(set);
        
    }
    
    private void find(Stack<Integer> stack, int[] nums, boolean[] isTaken) {
        
        if (stack.size() == nums.length) {
            
            set.add(new ArrayList<>(stack));
            
            return;
        }
        
        for (int i=0; i<nums.length; i++) {
            
            if (!isTaken[i]) {
                
                stack.push(nums[i]);
                isTaken[i] = true;
                
                find(stack, nums, isTaken);
                
                stack.pop();                    
                isTaken[i] = false;
            }
        }
    }
}
