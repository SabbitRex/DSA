# https://leetcode.com/problems/string-to-integer-atoi/

class String_To_Integer_ATOI {
    
    public int myAtoi(String s) {
        
        char[] charArray = s.trim().toCharArray();
        
        long result = 0;
        
        int sign = 1;
        
        for (int i=0; i< charArray.length; i++) {
            
            if (i == 0 && (charArray[i] == '+' || charArray[i] == '-')) {
                
                if (charArray[i] == '-') {
                    
                    sign = -1;
                }
                
                continue;
            }
            
            if (Character.isDigit(charArray[i])) {
                
                result = result * 10 + (charArray[i] - '0');
                
                if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                    
                    if (sign == 1) {
                        
                        return Integer.MAX_VALUE;
                        
                    } else {
                        
                        return Integer.MIN_VALUE;
                    }
                }
                
            } else {
                
                break;
            }
        }
        
        return (int) (sign * result);
    }
}
