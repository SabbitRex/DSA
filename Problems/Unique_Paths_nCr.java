# https://leetcode.com/problems/unique-paths/

class Unique_Paths_nCr {
    
    public int uniquePaths(int m, int n) {
        
        int maxRightStep = m-1;
        int maxDownStep = n-1;
        
        int N = maxRightStep + maxDownStep;
        
        int R = maxDownStep;
        
        double result = 1;
        
        for (int i=1; i<=R; i++) {
            
            result = result * (N - R + i)/i;
        }
        
        return (int) result;
    }
}
