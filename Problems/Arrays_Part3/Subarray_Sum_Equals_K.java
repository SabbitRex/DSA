# https://leetcode.com/problems/subarray-sum-equals-k/

class Subarray_Sum_Equals_K {
    
    public int subarraySum(int[] nums, int k) {
        
        Map<Integer, Integer> prefixSumElementFrequency = new HashMap<>();
        
        int prefixSum = 0;
        
        int result = 0;
        
        for (int i=0; i<nums.length; i++) {
            
            prefixSum = prefixSum + nums[i];
            
            if (prefixSum == k) {
                
                result++;
            }
            
            if (prefixSumElementFrequency.containsKey(prefixSum - k)) {
                
                result = result + prefixSumElementFrequency.get(prefixSum - k);
            }
            
            prefixSumElementFrequency.put(prefixSum, prefixSumElementFrequency.getOrDefault(prefixSum, 0) + 1);
        }
        
        return result;
    }
}
