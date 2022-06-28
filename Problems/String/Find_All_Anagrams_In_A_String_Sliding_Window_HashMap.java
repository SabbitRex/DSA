# https://leetcode.com/problems/find-all-anagrams-in-a-string/

class Find_All_Anagrams_In_A_String_Sliding_Window_HashMap {
    
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> result = new ArrayList<>();
        
        if (p == null || s == null || p.length() > s.length()) {
            
            return result;
        }
        
        Map<Character, Integer> pCharCount = new HashMap<>();
        
        Map<Character, Integer> sCharCount = new HashMap<>();
        
        for (int i=0; i<p.length(); i++) {
            
        	char c = p.charAt(i);
        	pCharCount.put(c, pCharCount.getOrDefault(c, 0)+1);
        }
        
        for (int i=0; i<p.length(); i++) {
            
        	char c = s.charAt(i);
        	sCharCount.put(c, sCharCount.getOrDefault(c, 0)+1);
        }
        
        int leftWindow = 0;
        
        int rightWindow = p.length()-1;
        
        while (rightWindow < s.length()) {
            
            if (pCharCount.equals(sCharCount)) {
            	
            	result.add(leftWindow);
            }
            
            if (rightWindow + 1 <= s.length() - 1) {
                
                char cToAdd = s.charAt(rightWindow + 1);
            
                sCharCount.put(cToAdd, sCharCount.getOrDefault(cToAdd, 0)+1);
            }
            
            char cToRemove = s.charAt(leftWindow);
            
            if (sCharCount.get(cToRemove) == 1) {
            	
            	sCharCount.remove(cToRemove);
            	
            } else {
            	
            	sCharCount.put(cToRemove, sCharCount.get(cToRemove)-1);
            }
            
            leftWindow++;
            rightWindow++;
        }
        
        return result;
    }
}
