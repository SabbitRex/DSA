# https://leetcode.com/problems/maximal-rectangle/

class Maximal_Rectangle_DP {
    
    public int maximalRectangle(char[][] matrix) {
        
        int[] currentLevel = new int[matrix[0].length];
        
        int globalMaxArea = Integer.MIN_VALUE;
        
        int localMaxArea = Integer.MIN_VALUE;
        
        for (int i=0; i<matrix.length; i++) {
            
            for (int j=0; j<matrix[0].length; j++) {
                
                if (matrix[i][j] == '1') {
                    
                    currentLevel[j] = currentLevel[j] + 1;
                    
                } else {
                    
                    currentLevel[j] = 0;
                }
            }
            
            localMaxArea = getHistogram(currentLevel);
            
            globalMaxArea = Math.max(globalMaxArea, localMaxArea);
        }
        
        return globalMaxArea;
    }
    
    private int getHistogram(int[] heights) {
        
        int globalMaxArea = Integer.MIN_VALUE;
        
        int[] prevSmall = getPrevSmall(heights);
        
        int[] nextSmall = getNextSmall(heights);
        
        for (int i=0; i<heights.length; i++) {
            
            int localMaxArea = (nextSmall[i] - prevSmall[i] - 1) * heights[i];
            
            globalMaxArea = Math.max(globalMaxArea, localMaxArea);
        }
        
        return globalMaxArea;
    }
    
    // Get next smaller
    private int[] getNextSmall(int[] heights) {
        
        int[] result = new int[heights.length];
        
        Stack<Integer> indexStack = new Stack<>();
        
        for (int i=heights.length-1; i>=0; i--) {
            
            // Keep on checking and poping if current element is smaller or equal to stack top untill stack is not empty
            while (!indexStack.isEmpty() && heights[indexStack.peek()] >= heights[i]) {
                
                indexStack.pop();
            }
            
            if (!indexStack.isEmpty()) {
                
                result[i] = indexStack.peek();
                
            } else {
                
                result[i] = heights.length;
            }
            
            indexStack.push(i);
        }
        
        return result;
    }
    
    // Get prev smaller
    private int[] getPrevSmall(int[] heights) {
        
        int[] result = new int[heights.length];
        
        Stack<Integer> indexStack = new Stack<>();
        
        for (int i=0; i<heights.length; i++) {
            
            // Keep on checking and poping if current element is smaller or equal to stack top untill stack is not empty
            while (!indexStack.isEmpty() && heights[indexStack.peek()] >= heights[i]) {
                
                indexStack.pop();
            }
            
            if (!indexStack.isEmpty()) {
                
                result[i] = indexStack.peek();
                
            } else {
                
                result[i] = -1;
            }
            
            indexStack.push(i);
        }
        
        return result;
    }
}
