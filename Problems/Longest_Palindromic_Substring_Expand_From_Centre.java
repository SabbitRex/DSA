# https://leetcode.com/problems/longest-palindromic-substring/

class Longest_Palindromic_Substring_Expand_From_Centre {
    
    public String longestPalindrome(String s) {
        
        String result = "";
        int resultSize = 0;
        
        for (int i=0; i<s.length(); i++) {
            
            // For odd length
            
            int leftOdd = i;
            int rightOdd = i;
            
            while (leftOdd >= 0 && rightOdd < s.length() && s.charAt(leftOdd) == s.charAt(rightOdd)) {
                
                if ((rightOdd - leftOdd + 1) > resultSize) {
                    
                    result = s.substring(leftOdd, rightOdd + 1);
                    
                    resultSize = rightOdd - leftOdd + 1;
                }
                
                leftOdd--;
                rightOdd++;
            }
            
            // For even length
            
            int leftEven = i;
            int rightEven = i + 1;
            
            while (leftEven >= 0 && rightEven < s.length() && s.charAt(leftEven) == s.charAt(rightEven)) {
                
                if ((rightEven - leftEven + 1) > resultSize) {
                    
                    result = s.substring(leftEven, rightEven + 1);
                    
                    resultSize = rightEven - leftEven + 1;
                }
                
                leftEven--;
                rightEven++;
            }
        }
        
        return result;
    }
}
