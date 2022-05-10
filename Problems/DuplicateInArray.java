class DuplicateInArray {
    
    public int findDuplicate(int[] nums) {
        
        int duplicate = 0;
        
        Set<Integer> set = new HashSet<Integer>();
        
        for (int num : nums) {
            
            if (!set.add(num)) {
                
                duplicate = num;
            }
        }
        
        return duplicate;
    }
}
