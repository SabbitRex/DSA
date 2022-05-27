class ImplementStrStr {

    public int strStr(String haystack, String needle) {
        
        if (haystack.contains(needle)) {
            
            return haystack.indexOf(needle);
            
        } else {
            
            return -1;
        }
    }
}
