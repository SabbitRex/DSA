# https://leetcode.com/problems/number-of-islands/

class Number_Of_Islands_Recursion {
    
    public int numIslands(char[][] grid) {
        
        int n = grid.length;
        
        int m = grid[0].length;
        
        int countIsland = 0;
        
        for (int i=0; i<n; i++) {
            
            for (int j=0; j<m; j++) {
                
                if (grid[i][j] == '1') {
                    
                    countIsland++;
                    
                    visitRecursively(i, j, n, m, grid);
                }
            }
        }
        
        return countIsland;
    }
    
    private void visitRecursively(int i, int j, int n, int m, char[][] grid) {
        
        grid[i][j] = '0';
        
        if(isAValidIndex(i+1, j, n, m, grid)) {
            
            visitRecursively(i+1, j, n, m, grid);
        }
        
        if(isAValidIndex(i-1, j, n, m, grid)) {
            
            visitRecursively(i-1, j, n, m, grid);
        }
        
        if(isAValidIndex(i, j+1, n, m, grid)) {
            
            visitRecursively(i, j+1, n, m, grid);
        }
        
        if(isAValidIndex(i, j-1, n, m, grid)) {
            
            visitRecursively(i, j-1, n, m, grid);
        }
    }
    
    private boolean isAValidIndex(int i, int j, int n, int m, char[][] grid) {
        
        if (i>=0 && i<n && j>=0 && j<m && grid[i][j] == '1') {
            
            return true;
        }
        
        return false;
    }
}
