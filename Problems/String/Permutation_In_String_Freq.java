# https://leetcode.com/problems/permutation-in-string/

class Permutation_In_String_Freq {
    
    public boolean checkInclusion(String s1, String s2) {
        
        if (s1.length() > s2.length()) {
            
            return false;
        }
        
        int[] freqS1 = new int[26];
        int[] freqS2 = new int[26];
        
        for (int i=0; i<s1.length(); i++) {
            
            freqS1[s1.charAt(i) - 'a']++;
            freqS2[s2.charAt(i) - 'a']++;
        }
        
        for (int i=s1.length(); i<s2.length(); i++) {
            
            if (Arrays.equals(freqS1, freqS2)) {
                
                return true;
            }
            
            freqS2[s2.charAt(i - s1.length()) - 'a']--;
            freqS2[s2.charAt(i) - 'a']++;
        }
        
        return Arrays.equals(freqS1, freqS2);
    }
}
