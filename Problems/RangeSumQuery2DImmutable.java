# https://leetcode.com/problems/range-sum-query-2d-immutable/

class RangeSumQuery2DImmutable {

    private int[][] matrix;
    
    public NumMatrix(int[][] matrix) {
        
        this.matrix = matrix;
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        
        int sum = 0;
        
        for (int i=row1; i<=row2; i++) {
            
            for (int j=col1; j<=col2; j++) {
                
                sum = sum + matrix[i][j];            }
        }
        
        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
