# https://leetcode.com/problems/longest-palindromic-subsequence/

class Longest_Palindromic_Subsequence_LCS_Matrix {

    public int longestPalindromeSubseq(String s) {

        StringBuilder builder = new StringBuilder(s);  
        
        String r = builder.reverse().toString();
        
        int m = s.length();
        
        int n = r.length();

        int[][] result = new int[m+1][n+1];
        
        for (int i=1; i<=m; i++) {
            
            for (int j=1; j<=n; j++) {
                
                if (s.charAt(i-1) == r.charAt(j-1)) {
                    
                    result[i][j] = 1 + result[i-1][j-1];
                    
                } else {
                    
                    result[i][j] = Math.max(result[i-1][j], result[i][j-1]);
                }
            }
        }
        
        return result[m][n];
    }
}
