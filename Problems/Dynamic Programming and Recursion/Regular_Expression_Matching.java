# https://leetcode.com/problems/regular-expression-matching/

class Regular_Expression_Matching {
    
    public boolean isMatch(String s, String p) {
        
        if (s == null || p == null) {
            
            return false;
        }
        
        boolean[][] dp = new boolean[s.length()+1][p.length()+1];
         
        dp[0][0] = true;
        
        // Fill 1st row before hand.
		for (int i=1; i<=p.length(); i++) {
            
            // If in any column you get '*' then for that column, in the same row got 2 index back.
            if (p.charAt(i-1) == '*') {
                
                dp[0][i] = dp[0][i-2];	
            }
		}
		
		for(int i=1; i<=s.length(); i++) {
            
			for(int j=1; j<=p.length(); j++) {
                
                // If you get p == s OR you get '.' in column then for that rowxcol -> get diagonal
                if (p.charAt(j-1) == '.' || p.charAt(j-1) == s.charAt(i-1)) {
                    
                    dp[i][j] = dp[i-1][j-1];
                    
                } else if (p.charAt(j-1) == '*') {
                    
                    // If in any column you get '*' then for that column, in the same row go 2 index back. OR (if this result is false)
                    // Check immediate previous of current p column and see if it matches with current s index AND
                    // One above the current column should be true
                    dp[i][j] = dp[i][j-2] || ((s.charAt(i-1) == p.charAt(j-2) || p.charAt(j-2) == '.') && dp[i-1][j]);    
                }
			}
		}
        
		return dp[s.length()][p.length()];
    }
}
