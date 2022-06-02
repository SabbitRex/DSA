class LongestCommonSubsequenceBottomUp {
    
    public int longestCommonSubsequence(String text1, String text2) {
        
        String[] str1 = text1.split("");
        String[] str2 = text2.split("");
        
        int m = str1.length;
        int n = str2.length;
        
        int[][] result = new int[m + 1][n + 1];
        
        for (int i=1; i<=m; i++) {
            
            for (int j=1; j<=n; j++) {
                
                if (str1[i-1].equals(str2[j-1])) {
                    
                    result[i][j] = 1 + result[i-1][j-1];
                    
                } else {
                    
                    result[i][j] = max(result[i-1][j], result[i][j-1]);
                }
            }
        }
        
        return result[m][n];
    }
    
    private int max(int i, int j) {
        
        if (i < j) {
            
            return j;
        }
        
        return i;
    }
}
