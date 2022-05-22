class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        
        int size = nums.length;
        
        int left = 0;
        int right = size - 1;
        
        while (left <= right) {
            
            int mid = left + (right - left)/2;
            
            if (nums[mid] < target) {
                
                left = mid + 1;
                
            } else if (nums[mid] > target) {
                
                right = mid - 1;
                
            } else {
                
                return mid;
            }
        }
        
        return left;
    }
}
