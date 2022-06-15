# https://leetcode.com/problems/number-of-1-bits/

public class Number_Of_1_Bits {
    
    public int hammingWeight(int n) {
        
        int count = 0;
        
        String s = Integer.toBinaryString(n);
        
        for (char c : s.toCharArray()) {
            
            if (c == '1') {
                
                count++;
            }
        }
        
        return count;
    }
}
