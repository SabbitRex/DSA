class MergeTwoSortedArray {

    public void merge(int[] arr1, int m, int[] arr2, int n) {
        
        if (n == 0) {
            
            return;
        }
        
        int size = m + n;
        
        int j = 0;
        
        for (int i=0; i<m; i++) {
            
            int left = arr1[i];
            int right = arr2[j];
            
            if (left <= right) {
                
                continue;
                
            } else if (left > right) {
                
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                
                Arrays.sort(arr2);
                continue;
                
            } else {
                
                j++;
            }
        }
        
        j = 0;
        
        for (int i = m; i<size; i++) {
            
            arr1[i] = arr2[j++];
        }
    }
}
