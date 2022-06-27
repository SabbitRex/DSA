# https://leetcode.com/problems/power-of-three/

class Power_Of_Three_Recursion {
    
    public boolean isPowerOfThree(int n) {
        
        if (n == 1) {
            
            return true;
            
        } else if (n <= 0) {
            
            return false;
        }
        
        if (n%3 == 0) {
            
            return isPowerOfThree(n/3);   
            
        } else {
            
            return false;
        }
    }
}
