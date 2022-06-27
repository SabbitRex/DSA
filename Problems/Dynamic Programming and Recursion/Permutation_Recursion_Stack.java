# https://leetcode.com/problems/permutations/

class Permutation_Recursion_Stack {
    
    List<List<Integer>> result = new ArrayList<>();
    
    public List<List<Integer>> permute(int[] nums) {
        
        Stack<Integer> stack = new Stack<>();
        
        boolean[] isTaken = new boolean[nums.length];
        
        find(stack, nums, isTaken);
        
        return result;
    }
    
    private void find(Stack<Integer> stack, int[] nums, boolean[] isTaken) {
        
        if (stack.size() == nums.length) {
            
            result.add(new ArrayList<>(stack));
            
            return;
        }
        
        for (int i=0; i<nums.length; i++) {
            
            if (isTaken[i] == false) {
                
                stack.push(nums[i]);
                isTaken[i] = true;
                
                find(stack, nums, isTaken);
                
                isTaken[i] = false;
                stack.pop();
            }
        }
    }
}
