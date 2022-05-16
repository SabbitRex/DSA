class RotateArrayClockwiseByK2 {
    
    public static void rotate(int[] nums, int k) {
        
        k = k % nums.length;
        
        rotate(nums, 0, nums.length - 1);
        
        rotate(nums, 0, k-1);
        
        rotate(nums, k, nums.length-1);
        
    }
    
    private static void rotate(int[] array, int start, int end) {
        
        while (start < end) {
            
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
