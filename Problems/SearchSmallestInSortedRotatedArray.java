class SearchSmallestInSortedRotatedArray {

    public int findMin(int[] nums) {
        
        int start = 0;
        
        int end = nums.length - 1;
        
        int smallest = nums[0];
        
        while (start <= end) {
            
            if (nums[start] < nums[end] && nums[start] < smallest) {
                
                smallest = nums[start];
            }
            
            int mid = (start + end)/2;
            
            if (nums[mid] < smallest) {
                
                smallest = nums[mid];
            }
            
            if (nums[mid] >= nums[start]) {
                
                start = mid + 1;
                
            } else {
                
                end = mid - 1;
            }
        }
        
        return smallest;
    }
}
