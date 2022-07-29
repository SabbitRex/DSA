# https://leetcode.com/problems/reverse-pairs/

class Reverse_Pairs {
    
    public int reversePairs(int[] nums) {
        
        return divide(nums, 0, nums.length - 1);
    }
    
    private int divide(int[] nums, int start, int end) {
        
        if (start >= end) {
            
            return 0;
        }
            
        int count = 0;

        int mid = (start + end)/2;

        count = count + divide(nums, start, mid);
        count = count + divide(nums, mid + 1, end);

        count = count + merge(nums, start, mid, end);

        return count;
    }
    
    private int merge(int[] nums, int start, int mid, int end) {
        
        int i = start;
        int j = mid + 1;
        
        int count = 0;
        
        while (i <= mid && j <= end) {
        
            if ((long) nums[i] > 2 * (long) nums[j]) {
                
                count = count +  mid - i + 1;
                j++;
                
            } else {
                
                i++;
            }
        }
        
        int[] temp = new int[end - start + 1];

        i = start;
        j = mid + 1;
        
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
        
        return count;
    }
}
