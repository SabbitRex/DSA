# https://leetcode.com/problems/remove-palindromic-subsequences/

class Remove_Palindromic_Subsequences_Two_Pointers {
    
    public int removePalindromeSub(String s) {
        
        int left = 0;
        
        int right = s.length() - 1;
        
        boolean isPalindrome =  true;
        
        while (left < right) {
            
            if (s.charAt(left) == s.charAt(right)) {
                
                left++;
                right--;
                
            } else {
                
                isPalindrome = false;
                break;
            }
        }
        
        if (isPalindrome) {
                
            return 1;
        }
        
        return 2;
    }
}
