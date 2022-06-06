# https://leetcode.com/problems/rotate-image/

class Rotate_Image_Iterative {
    
    public void rotate(int[][] matrix) {
        
        int size = matrix.length;
        
        for (int i=0; i<size; i++) {
            
            for (int j=0; j<i; j++) {
                
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        for (int i=0; i<size; i++) {
            
            for (int j=0; j<size/2; j++) {
                
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][size-j-1];
                matrix[i][size-j-1] = temp;
            }
        }
    }
}
