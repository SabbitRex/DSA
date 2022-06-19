# https://leetcode.com/problems/shortest-path-in-binary-matrix/

class Shortest_Path_In_Binary_Matrix_BFS {
    
    public int shortestPathBinaryMatrix(int[][] grid) {
        
        if (grid[0][0] == 1) {
            
            return -1;
        }
        
        int m = grid.length;
        int n = grid[0].length;
        
        Queue<Integer[]> queue = new LinkedList<>();
        
        int count = 1;
        
        queue.add(new Integer[]{0,0, count});
        
        grid[0][0] = 1;
        
        int[][] directions = new int[][] {{0, 1}, {1, 0}, {0, -1}, {-1, 0}, {1, 1}, {-1, -1}, {1, -1}, {-1, 1}};
        
        while (!queue.isEmpty()) {
            
            int queueSize = queue.size();
            
            while (queueSize > 0) {
                
                Integer[] currentCell = queue.poll();
                
                if (currentCell[0] == m-1 && currentCell[1] == n-1) {
                    
                    return currentCell[2];
                }
                
                for (int[] direction : directions) {
                    
                    int x = direction[0] + currentCell[0];
                    int y = direction[1] + currentCell[1];
                    
                    if (isValid(x, y, m, n, grid)) {
                        
                        queue.add(new Integer[] {x, y, currentCell[2] + 1});
                        grid[x][y] = 1;
                    }
                }
                
                queueSize--;
            }
        }
        
        return -1;
    }
    
    private boolean isValid(int x, int y, int m, int n, int[][] grid) {
        
        if (x >= 0 && y >= 0 && x < m && y < n && grid[x][y] == 0) {
            
            return true;
        }
        
        return false;
    }
}
