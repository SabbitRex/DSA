# https://leetcode.com/problems/set-matrix-zeroes/

class Set_Matrix_Zeroes_HashSet {
    
    public void setZeroes(int[][] matrix) {
        
        int n = matrix.length;
        
        int m = matrix[0].length;
        
        Set<Integer> r = new HashSet<Integer>();
        
        Set<Integer> c = new HashSet<Integer>();
        
        for (int i=0; i<n; i++) {
            
            for (int j=0; j<m; j++) {
                
                if (matrix[i][j] == 0) {
                    
                    r.add(i);
                    c.add(j);
                }
            }
        }
        
        for (int i=0; i<n; i++) {
            
            for (int j=0; j<m; j++) {
                
                if (r.contains(i) || c.contains(j)) {
                    
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
