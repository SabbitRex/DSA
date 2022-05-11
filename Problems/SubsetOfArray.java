class SubsetOfArray {
    
    List<List<Integer>> result = new ArrayList<>();
    
    public List<List<Integer>> subsets(int[] nums) {
        
        List<Integer> internalList = new ArrayList<>();
        
        recurseForSubset(0, nums, internalList);
        
        return result;
    }
    
    public void recurseForSubset(int currentIndex, int[] nums, List<Integer> internalList) {
        
        result.add(new ArrayList<>(internalList));
        
        for (int i = currentIndex; i<nums.length; i++) {
            
            internalList.add(nums[i]);
            
            currentIndex++;
            
            recurseForSubset(currentIndex, nums, internalList);
            
            internalList.remove(internalList.size() - 1);
        }
    }
}
