# https://leetcode.com/problems/triangle/

class Triangle_Dynamic_Programming {
    
    public int minimumTotal(List<List<Integer>> triangle) {
        
        int[] dp = new int[triangle.size()+1];
        
        int lastLevelIdx = triangle.size()-1;
        
        while (lastLevelIdx >= 0) {
            
            for (int i=0; i<triangle.get(lastLevelIdx).size(); i++) {
                
                dp[i] = triangle.get(lastLevelIdx).get(i) + Math.min(dp[i], dp[i+1]);
            }
            
            lastLevelIdx--;
        }
        
        return dp[0];
    }
}
