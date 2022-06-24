# https://leetcode.com/problems/implement-strstr/

class Implement_StrStr {

    public int strStr(String haystack, String needle) {
        
        if (haystack.contains(needle)) {
            
            return haystack.indexOf(needle);
            
        } else {
            
            return -1;
        }
    }
}
