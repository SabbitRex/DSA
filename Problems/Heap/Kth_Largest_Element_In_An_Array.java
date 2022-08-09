# https://leetcode.com/problems/kth-largest-element-in-an-array/

class Kth_Largest_Element_In_An_Array {
    
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int i=0; i<nums.length; i++) {
            
            pq.add(nums[i]);
            
            if (pq.size() > k) {
                
                pq.poll();
            }
        }
        
        return pq.peek();
    }
}
