# https://leetcode.com/problems/number-of-islands/

class Number_Of_Islands_Recursion {
    
    public int numIslands(char[][] grid) {
        
        int count = 0;
        
        int m = grid.length;
        int n = grid[0].length;
        
        for (int i=0; i<m; i++) {
            
            for (int j=0; j<n; j++) {
                
                if (grid[i][j] == '1') {
                    
                    count++;
                    
                    dfs(i, j, grid, m, n);
                }
            }
        }
        
        return count;
    }
    
    private void dfs(int i, int j, char[][] grid, int m, int n) {
        
        grid[i][j] = '0';
        
        // CHECK UP
        if (isValidIndex(i+1, j, grid, m, n)) {
            
            dfs(i+1, j, grid, m, n);
        }
        
        // CHECK DOWN
        if (isValidIndex(i-1, j, grid, m, n)) {
            
            dfs(i-1, j, grid, m, n);
        }
        
        // CHECK RIGHT
        if (isValidIndex(i, j+1, grid, m, n)) {
            
            dfs(i, j+1, grid, m, n);
        }
        
        // CHECK LEFT
        if (isValidIndex(i, j-1, grid, m, n)) {
            
            dfs(i, j-1, grid, m, n);
        }
    }
    
    private boolean isValidIndex(int i, int j, char[][] grid, int m, int n) {
        
        if (i >= 0 && i <m && j>=0 && j<n && grid[i][j] == '1') {
            
            return true;
        }
        
        return false;
    }
}
