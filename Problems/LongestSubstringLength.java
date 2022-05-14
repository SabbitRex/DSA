class LongestSubstringLength {
    
    public int lengthOfLongestSubstring(String s) {
        
        if (s.isEmpty()) {
           
            return 0;
        }
        
        String[] str = s.split("");
        
        Set<String> set = new HashSet<String>();
        
        String result = "";
        
        int globalMaxSubStringSize = 0;
        
        for (int i=0; i<str.length; i++) {
            
        	int localMaxSubStringSize = 0;
        	
            for (int j=i; j<str.length; j++) {
                
                if (set.add(str[j])) {
                    
                    result = result + str[j];
                    localMaxSubStringSize++;
                    
                } else {
                    
                    result = "";
                    set.clear();
                    break;
                }
            }
            
            if (globalMaxSubStringSize < localMaxSubStringSize) {
            	
            	globalMaxSubStringSize = localMaxSubStringSize;
            }
        }
        
        return globalMaxSubStringSize;
    }
}
