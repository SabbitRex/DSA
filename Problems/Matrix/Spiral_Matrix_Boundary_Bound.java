# https://leetcode.com/problems/spiral-matrix/

class Spiral_Matrix_Boundary_Bound {
    
    public List<Integer> spiralOrder(int[][] matrix) {
        
        int leftB = 0;
        int rightB = matrix[0].length - 1;
        int topB = 0;
        int bottomB = matrix.length - 1;
        
        List<Integer> result = new ArrayList<>();
        
        while (leftB <= rightB && topB <= bottomB) {
            
            for (int i=leftB; i<=rightB; i++) {
                
                result.add(matrix[topB][i]);
            }
            
            topB++;
            
            for (int i=topB; i<=bottomB; i++) {
                
                result.add(matrix[i][rightB]);
            }
            
            rightB--;
            
            if (topB <= bottomB) {
                
                for (int i=rightB; i>=leftB; i--) {

                    result.add(matrix[bottomB][i]);
                }

                bottomB--;
            }
            
            if (leftB <= rightB) {
                
                for (int i=bottomB; i>=topB; i--) {

                    result.add(matrix[i][leftB]);
                }

                leftB++;
            }

        }
        
        return result;
    }
}
