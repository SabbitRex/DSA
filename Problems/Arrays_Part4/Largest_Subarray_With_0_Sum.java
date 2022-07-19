# https://practice.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1

class Largest_Subarray_With_0_Sum {
    
    int maxLen(int arr[], int n) {
        
        Map<Integer, Integer> prefixMap = new HashMap<>();
        
        int globalMax = 0;
        
        int sum = 0;
        
        for (int i=0; i<arr.length; i++) {
            
            sum = sum + arr[i];
            
            if (sum == 0) {
                
                globalMax = i + 1;
                
            } else {
                
                if (!prefixMap.containsKey(sum)) {
                    
                    prefixMap.put(sum, i);
                }
                
                int idx = prefixMap.get(sum);
                
                globalMax = Math.max(globalMax, Math.abs(i - idx));
            }
        }
        
        return globalMax;
    }
}
