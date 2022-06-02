# https://leetcode.com/problems/consecutive-characters/

class ConsecutiveCharacters {
    
    public int maxPower(String s) {
        
        if (s.length() < 2) {
            
            return 1;    
        }
        
        int[] freq = new int[26];
        
        int i = 0;
        int j = 0;
        
        int count = 0;
        
        while (i < s.length() - 1) {
            
            if (s.charAt(i) == s.charAt(j)) {
                
                count++;
                j++;
                
            } else {
                
            	char c = s.charAt(i);
            	int x = s.charAt(i) - 'a';
            	
                if (count > freq[s.charAt(i) - 'a']) {
                    
                    freq[s.charAt(i) - 'a'] = count;
                }
                
                i = j;
                count = 0;
            }
            
            if (j == s.length()) {
                
                if (count > freq[s.charAt(i) - 'a']) {
                    
                    freq[s.charAt(i) - 'a'] = count;
                }
                
                i++;
                j = i;
                count = 0;
            }
        }
        
        int max = 0;
        
        for (int m=0; m<freq.length; m++) {
            
            if (max < freq[m]) {
                
                max = freq[m];
            }
        }
        
        return max;
    }
}
