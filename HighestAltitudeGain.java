class HighestAltitudeGain {

    public int largestAltitude(int[] gain) {
        
        int maxGain = -101;
        
        int sum = 0;
        
        for (int num : gain) {
                
            sum = sum + num;
            
            if (sum > maxGain) {
                
                maxGain = sum;
            }
        }
        
        if (maxGain < 0) {
            
            return 0;
        }
        
        return maxGain;
    }
}
