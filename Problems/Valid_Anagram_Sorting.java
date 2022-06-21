class Valid_Anagram_Sorting {
    
    public boolean isAnagram(String s, String t) {
            
        char[] c1 = s.toCharArray();
        
        Arrays.sort(c1);
        
        char[] c2 = t.toCharArray();
        
        Arrays.sort(c2);
        
        if (new String(c1).equals(new String(c2))) {
            
            return true;
        }
        
        return false;
    }
}
