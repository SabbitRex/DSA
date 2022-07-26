# https://leetcode.com/problems/combination-sum/

class Combination_Sum {
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> result = new ArrayList<>();
        
        List<Integer> list = new ArrayList<>();
        
        int startIdx = 0;
        
        recurse(startIdx, result, candidates, target, list);
        
        return result;
    }
    
    private void recurse(int idx, List<List<Integer>> result, int[] candidates, int target, List<Integer> list) {
        
        if (idx == candidates.length) {
            
            if (target == 0) {
            
                List<Integer> temp = new ArrayList<>(list);
                
                result.add(temp);
            }
            
            return;
        }
        
        if (candidates[idx] <= target) {
            
            list.add(candidates[idx]);
            recurse(idx, result, candidates, target - candidates[idx], list);
            list.remove(list.size() - 1);
        }
          
        recurse(idx + 1, result, candidates, target, list);
    }
}
