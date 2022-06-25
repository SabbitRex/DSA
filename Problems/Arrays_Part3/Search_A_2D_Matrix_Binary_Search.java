# https://leetcode.com/problems/search-a-2d-matrix/

class Search_A_2D_Matrix_Binary_Search {
    
    public static boolean searchMatrix(int[][] matrix, int target) {
        
        // Levels
        int m = matrix.length;
        
        // Elements in each level
        int n = matrix[0].length - 1;
        
        boolean isPresent = false;
        
        for (int i=0; i<m; i++) {
            
			// Check if element at last of each level is bigger or equal to target
            if (target <= matrix[i][n]) {
                
                isPresent = binarySearch(target, matrix[i]);
                
                break;
            }
        }
        
        return isPresent;
    }
    
    private static boolean binarySearch(int target, int[] matrix) {
        
        int start = 0;
        int end = matrix.length - 1;
        
        boolean isElementFound = false;
        
        int mid = (start + end)/2;
        
        while (start <= end) {
            
            if (matrix[mid] > target) {
                
                end = mid - 1;
                
            } else if (matrix[mid] < target) {
                
                start = mid + 1;
                
            } else {
                
                isElementFound = true;
                break;
            }
            
            mid = (start + end)/2;
        }
        
        return isElementFound;
    }
}
