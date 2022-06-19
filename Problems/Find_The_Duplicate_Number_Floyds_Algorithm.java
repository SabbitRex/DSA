# https://leetcode.com/problems/find-the-duplicate-number/

class Find_The_Duplicate_Number_Floyds_Algorithm {
    
    public int findDuplicate(int[] nums) {
        
        int turtle = 0;
        int rabbit = 0;
        
        while (true) {
            
            turtle = nums[turtle];
            rabbit = nums[nums[rabbit]];
            
            if (turtle == rabbit) {
                
                int turtle2 = 0;
                
                while (true) {
                    
                    turtle2 = nums[turtle2];
                    turtle = nums[turtle];
                    
                    if (turtle2 == turtle) {
                        
                        return turtle2;
                    }
                }
            }
        }
    }
}
