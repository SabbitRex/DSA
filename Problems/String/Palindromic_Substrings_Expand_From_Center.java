# https://leetcode.com/problems/palindromic-substrings/

class Palindromic_Substrings_Expand_From_Center {
    
    public int countSubstrings(String s) {
        
        int count = 0;
        
        for (int i=0; i<s.length(); i++) {
            
            int leftOdd = i;
            int rightOdd = i;
            
            String localString = null;
            
            while (leftOdd >= 0 && rightOdd < s.length() && s.charAt(leftOdd) == s.charAt(rightOdd)) {
                    
                localString = s.substring(leftOdd, rightOdd + 1);
                
                count++;
                leftOdd--;
                rightOdd++;
            }
            
            int leftEven = i;
            int rightEven = i + 1;
            
            while (leftEven >= 0 && rightEven < s.length() && s.charAt(leftEven) == s.charAt(rightEven)) {
                    
                localString = s.substring(leftEven, rightEven + 1);
                
                count++;
                leftEven--;
                rightEven++;
            }
        }
        
        return count++;
    }
}
