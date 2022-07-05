# https://leetcode.com/problems/permutation-in-string/

class Permutation_In_String_Brute_Force {
    
    public boolean checkInclusion(String s1, String s2) {
        
        int left = 0;
        
        int right = s1.length() - 1;
        
        char[] c1 = s1.toCharArray();
        
        Arrays.sort(c1);
        
        while (left <= s2.length() - s1.length()) {
            
            String temp = s2.substring(left, right + 1);
            
            char[] c2 = temp.toCharArray();
            
            Arrays.sort(c2);
            
            if (Arrays.equals(c1, c2)) {
                
                return true;
            }
            
            left++;
            right++;
        }
        
        return false;
    }
}
