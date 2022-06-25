# https://leetcode.com/problems/merge-sorted-array/

class Merge_Sorted_Array_Start_From_End {
    
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    
        // Start filling from last pos of nums1
        int insertPosition = m + n - 1;
        
        int idx1 = m-1;
        int idx2 = n-1;
        
        // Fill till one of nums1 or nums2 exhausts and keep decrementing last pos
        while (idx1 >= 0 && idx2 >= 0) {
            
            if (nums1[idx1] < nums2[idx2]) {
                
                nums1[insertPosition] = nums2[idx2];

                idx2--;
                
            } else if (nums1[idx1] > nums2[idx2]) {
                
                nums1[insertPosition] = nums1[idx1];
  
                idx1--;
                
            } else {
                
                nums1[insertPosition] = nums1[idx1];

                idx1--;
            }
            
            insertPosition--;
        }
        
        // Fill letf over of nums2 to nums1 incase there is any
        while (idx2 >= 0) {
            
            nums1[insertPosition] = nums2[idx2];
            idx2--;
            insertPosition--;
        }
    }
}
