class KthDistinctLargestNumberInArray {
    
    public int findKthLargest(int[] nums, int k) {
        
        Set<Integer> set = new HashSet<>();
        
        for (int i=0; i<nums.length; i++) {
        	
        	set.add(nums[i]);
        }
        
        int[] array = set.stream().mapToInt(Number::intValue).toArray();
        
        return array[array.length - k];
    }
}
