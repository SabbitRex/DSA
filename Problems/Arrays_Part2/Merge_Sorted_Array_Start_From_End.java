# https://leetcode.com/problems/merge-sorted-array/

class Merge_Sorted_Array_Start_From_End {
    
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int positionToAdd = nums1.length - 1;
        
        m = m-1;
        n = n-1;
        
        while (m>=0 && n>=0) {
            
            if (nums1[m] < nums2[n]) {
                nums1[positionToAdd] = nums2[n];
                n--;
                
            } else {
                nums1[positionToAdd] = nums1[m];
                m--;
            }
            
            positionToAdd--;
        }
        
        while (n >= 0) {
            nums1[positionToAdd] = nums2[n];
            n--;
            positionToAdd--;
        }
    }
}
