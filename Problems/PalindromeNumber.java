class PalindromeNumber {
    
    public boolean isPalindrome(int x) {
        
        boolean isNegative = false;
        
        if (x < 0) {
            isNegative = true;
            x = x * -1;
        }
        
        int rev = 0;
        int num = x;
        
        while (x > 0) {
            int rem = x % 10;
            rev = rev * 10 + rem;
            x = x / 10;
        }
        
        if (num == rev && !isNegative) {
            return true;
        }
        
        return false;
    }
}
