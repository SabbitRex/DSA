# https://leetcode.com/problems/trapping-rain-water/

class Trapping_Rain_Water {
    
    public int trap(int[] height) {
        
        int size = height.length;
        
        int[] leftGreaterBlock = new int[size];
        
        int[] rightGreaterBlock = new int[size];
        
        int currentLeftMax = 0;
        
        for (int i=0; i<size; i++) {
            
            if (height[i] > currentLeftMax) {
                
                currentLeftMax = height[i];
            }
            
            leftGreaterBlock[i] = currentLeftMax;
        }
        
        int currentRightMax = 0;
        
        for (int i=size-1; i>=0; i--) {
            
            if (height[i] > currentRightMax) {
                
                currentRightMax = height[i];
            }
            
            rightGreaterBlock[i] = currentRightMax;
        }
        
        int result = 0;
        
        for (int i=0; i<size; i++) {
            
            result = result + Math.min(leftGreaterBlock[i], rightGreaterBlock[i]) - height[i];
        }
        
        return result;
    }
}
