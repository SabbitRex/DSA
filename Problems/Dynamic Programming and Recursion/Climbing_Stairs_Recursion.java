# https://leetcode.com/problems/climbing-stairs/

class Climbing_Stairs_Recursion {
    
    public int climbStairs(int n) {
        
        return count(n, 0);
    }
    
    private int count(int sum, int result) {
        
        if (sum < 0) {
            
            return 0;
        }
        
        if (sum == 0) {
            
            result = result + 1;
            return result;         
        }
        
        int minusOne = count(sum - 1, result);
        
        int minusTwo = count(sum - 2, result);
        
        return minusOne + minusTwo;
    }
}
