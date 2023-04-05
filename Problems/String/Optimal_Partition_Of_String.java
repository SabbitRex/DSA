class Solution {
    public int partitionString(String s) {
        
        boolean[] b = new boolean[26];
        
        Arrays.fill(b, false);
        
        int idx = 0;
        int result = 1;
        
        while (idx < s.length()) {
            
            int n = s.charAt(idx)-'a';
            
            if (b[n] == true) {
                Arrays.fill(b, false);
                result++;
            }
            
            b[n] = true;
            idx++;
        }
        
        return result;
    }
}
