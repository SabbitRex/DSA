# https://leetcode.com/problems/sort-colors/

class Sort_Colours_Merge_Sort {
    
    public void sortColors(int[] nums) {
        
        mergeSort(nums, 0, nums.length-1);
    }
    
    private void mergeSort(int[] nums, int start, int end) {
        
        if (start < end) {
            
            int mid = (start + end)/2;
            
            mergeSort(nums, start, mid);
            mergeSort(nums, mid+1, end);
            
            merge(nums, start, mid, end);
        }
    }
    
    private void merge(int[] nums, int start, int mid, int end) {
        
        int[] temp = new int[end - start + 1];
        
        int i = start;
        
        int j = mid + 1;
        
        int k = 0;
        
        while (i <= mid && j <= end) {
            
            if (nums[i] <= nums[j]) {
                
                temp[k] = nums[i];
                i++;
                
            } else {
                
                temp[k] = nums[j];
                j++;
            }
            
            k++;
        }
        
        if (i > mid) {
            
            while (j <= end) {
                
                temp[k] = nums[j];
                j++;
                k++;
            }
            
        } else {
            
            while (i <= mid) {
                
                temp[k] = nums[i];
                i++;
                k++;
            }
        }
        
        for (int m=start; m<=end; m++) {
            
            nums[m] = temp[m - start];
        }
    }
}
