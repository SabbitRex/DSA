# https://leetcode.com/problems/sort-an-array/

class Sort_An_Array_Merge_Sort {
    
    public int[] sortArray(int[] nums) {
        
        int start = 0;
        int end = nums.length - 1;
        
        mergeSort(nums, start, end);
        
        return nums;
    }
    
    private static void mergeSort(int[] nums, int start, int end) {
        
        if (start < end) {
            
            int mid = (start + end)/2;
            
            mergeSort(nums, start, mid);
            mergeSort(nums, mid + 1, end);
            
            merge(nums, start, mid, end);
        }
    }
    
    private static void merge(int[] nums, int start, int mid, int end) {
        
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
