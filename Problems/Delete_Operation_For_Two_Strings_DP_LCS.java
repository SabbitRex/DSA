# https://leetcode.com/problems/delete-operation-for-two-strings/

class Delete_Operation_For_Two_Strings_DP_LCS {
    
    public int minDistance(String word1, String word2) {
        
        int m = word1.length();
        int n = word2.length();
        
        int[][] dp = new int[m+1][n+1];
        
        for (int i=1; i<=m; i++){
            
            for (int j=1; j<=n; j++) {
                
                if (word1.charAt(i-1) == word2.charAt(j-1)) {
                    
                    dp[i][j] = 1 + dp[i-1][j-1];
                    
                } else {
                    
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        
        return m + n - 2 * dp[m][n];
    }
}
