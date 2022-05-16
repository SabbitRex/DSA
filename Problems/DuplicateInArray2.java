class DuplicateInArray2 {

    public boolean containsDuplicate(int[] nums) {
        
        Set<Integer> set = new HashSet<Integer>();
        
        boolean hasDuplicate = false;
        
        for (int i=0; i<nums.length; i++) {
            
            if (!set.add(nums[i])) {
                
                hasDuplicate = true;
                break;
            }
        }
        
        return hasDuplicate;
    }
}
