class Valid_Anagram_Frequency {
    
    public boolean isAnagram(String s, String t) {
        
        int[] freqS1 = getFrequency(s);
        
        int[] freqS2 = getFrequency(t);
        
        for (int i=0; i<26; i++) {
        	
        	if (freqS1[i] != freqS2[i]) {
        		
        		return false;
        	}
        }
        
        return true;
    }
    
    private int[] getFrequency(String str) {
        
        int[] frequency = new int[26];
        
        for (int i=0; i<str.length(); i++) {
            
            frequency[str.charAt(i) - 'a']++;
        }
        
        return frequency;
    }
}
