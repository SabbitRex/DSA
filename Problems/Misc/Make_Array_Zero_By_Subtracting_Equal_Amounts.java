# https://leetcode.com/problems/make-array-zero-by-subtracting-equal-amounts/

class Make_Array_Zero_By_Subtracting_Equal_Amounts {
    
    public int minimumOperations(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            
            if (num != 0) {
                
                set.add(num);
            }
        }
        
        return set.size();
    }
}
