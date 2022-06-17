# https://leetcode.com/problems/find-all-anagrams-in-a-string/

class Find_All_Anagrams_In_A_String_Brute_Force {
    
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> result = new ArrayList<>();
        
        int leftWindow = 0;
        
        char[] pCharArray = p.toCharArray();
        
        Arrays.sort(pCharArray);
        
        while (leftWindow <= s.length() - p.length()) {
            
            String windowValue = s.substring(leftWindow, leftWindow + p.length());
            
            char[] windowCharArray = windowValue.toCharArray();
            
            Arrays.sort(windowCharArray);
            
            if (String.valueOf(pCharArray).equals(String.valueOf(windowCharArray))) {
                
                result.add(leftWindow);
            }
            
            leftWindow++;
        }
        
        return result;
    }
}
