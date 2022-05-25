public class LongestPalindromicSubstringSlow {
	
    public static String longestPalindrome(String s) {
        
        if (s.length() == 1) {
            
           return s; 
        }
        
        String[] str = s.split("");
        
        int globalMaxLength = 0;
        
        String result = null;
        
        for (int i=0; i<str.length; i++) {
            
            String temp = str[i];
            
            for (int j=i+1; j<str.length; j++) {
                
                temp = temp + str[j];
                
                boolean isPalindrome = checkPalindrome(temp);
                
                if (isPalindrome) {
                	
                	if (globalMaxLength < temp.length()) {
                		
                		result = temp;
                		globalMaxLength = temp.length();
                	}
                }
                
                if (temp.length() == s.length() && temp.equals(s) && isPalindrome) {
                	
                	return temp;
                }
            }
        }
        
        if (result == null) {
            
            return str[0];
        }
        
        return result;
    }
    
    private static boolean checkPalindrome(String str) {
        
    	String reverseStr = "";
    	
        for (int i = (str.length() - 1); i >=0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }
        
        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
        	
        	return true;
        }
        
        return false;
    }
    
    public static void main(String[] args) {
		
    	System.out.println(longestPalindrome("skndaounxokanaaaaaccvccaaaaaaefgy"));
	}
}
