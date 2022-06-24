# https://leetcode.com/problems/majority-element/

class Majority_Element_Moores_Voting_Algorithm {
    
    public int majorityElement(int[] nums) {
        
        int result = 0; 
        int count = 0;
        
        for (int num : nums) {
            
            if (count == 0) {
                
                result = num;
            }
            
            if (result != num) {
                
                count++;
                
            } else {
                
                count--;
            }
        }
        
        return result;
    }
}
