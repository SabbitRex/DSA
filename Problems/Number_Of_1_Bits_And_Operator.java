# https://leetcode.com/problems/number-of-1-bits/

public class Number_Of_1_Bits_And_Operator {
    
    public int hammingWeight(int n) {
        
        int count = 0;
        
        while (n != 0) {
            
            n = n & n-1;
            
            count++;
        }
        
        return count;
    }
}
