class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        
        String longestCommonPrefix  = "";
        
        if (strs.length == 0 || strs == null) {
            
            return longestCommonPrefix;
        }
        
        int index = 0;
        
        for (char chr : strs[0].toCharArray()) {
            
            for (int i=1; i<strs.length; i++) {
                
                if (index >= strs[i].length() || chr != strs[i].charAt(index)) {
                    
                    return longestCommonPrefix;
                }
            }
            
            longestCommonPrefix = longestCommonPrefix + chr;
            index++;
        }
        
        return longestCommonPrefix;
    }
}
