# https://leetcode.com/problems/jump-game/

class Jump_Game {
    
    public boolean canJump(int[] nums) {
        
        int goal = nums.length-1;
        
        int start = 0;
        
        for (int i=nums.length-2; i>=start; i--) {
            
            if (i + nums[i] >= goal) {
                
                goal = i;             
            }
        }
        
        return goal == start;
    }
}
