class Permutation {
    
    List<List<Integer>> result = new ArrayList<>();
    
    public List<List<Integer>> permute(int[] nums) {
        
        Stack<Integer> stack = new Stack<Integer>();

        boolean[] isTaken = new boolean[nums.length];
        
        List<List<Integer>> result = new ArrayList<>();

        findCombination(result, stack, isTaken, nums);
        
        return result;
    }
    
    private void findCombination(List<List<Integer>> result, Stack<Integer> stack, boolean[] isTaken, int[] nums) {
        
        if (stack.size() == nums.length) {
            
            result.add(new ArrayList<>(stack));
            return;
        }
        
        for (int i=0; i<nums.length; i++) {
            
            if (isTaken[i] == false) {
                
            	isTaken[i] = true;
                
                stack.push(nums[i]);
                
                findCombination(result, stack, isTaken, nums);
                
                stack.pop();
                
                isTaken[i] = false;
            }
        }
    }
}
