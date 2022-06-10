# https://leetcode.com/problems/longest-substring-without-repeating-characters/

class Longest_Substring_Without_Repeating_Characters_Sliding_Window {
    
    public int lengthOfLongestSubstring(String s) {
        
        int windowStart = 0;
        int windowEnd = 0;
        
        Set<Character> set = new HashSet<>();
        
        int maxWindowSize = 0;
        
        while (windowEnd < s.length()) {
            
            if (set.contains(s.charAt(windowEnd))) {
                
                set.remove(s.charAt(windowStart));
                windowStart++;
                
            } else {
                
                set.add(s.charAt(windowEnd));
                windowEnd++;
            }
            
            if (maxWindowSize < set.size()) {
                
                maxWindowSize = set.size();
            }
        }
        
        return maxWindowSize;
    }
}
