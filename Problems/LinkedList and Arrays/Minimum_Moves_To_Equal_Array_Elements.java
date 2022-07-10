# https://leetcode.com/problems/minimum-moves-to-equal-array-elements/

class Minimum_Moves_To_Equal_Array_Elements {
    
    public int minMoves(int[] nums) {
        
        int min = nums[0];
        
        // Find min in array
        for (int num : nums) {
            
            if (num < min) {
                
                min = num;
            }
        }
        
        // Subtract min from each element of array
        for (int i=0; i<nums.length; i++) {
            
            nums[i] = nums[i] - min;
        }
        
        int result = 0;
        
        
        // Add all elements for result
        for (int num : nums) {
            
            result = result + num;
        }
        
        return result;
    }
}
