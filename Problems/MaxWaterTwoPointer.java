class MaxWaterTwoPointer {
  
    public int maxArea(int[] height) {
        
        int left = 0;
        
        int right = height.length-1;
        
        int globalMaxArea = 0;
        
        while (left < right) {
            
            int localMaxArea = 0;
            
            if (height[left] >= height[right]) {
                
                localMaxArea = (right - left) * height[right];
                right--;
                
            } else {
                    
                localMaxArea = (right - left) * height[left];
                left++;
            }
            
            if (globalMaxArea < localMaxArea) {
                
                globalMaxArea = localMaxArea;
            }
        }
        
        return globalMaxArea;
    }
}
