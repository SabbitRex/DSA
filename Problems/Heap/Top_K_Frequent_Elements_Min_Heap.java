# https://leetcode.com/problems/top-k-frequent-elements/

class Top_K_Frequent_Elements_Min_Heap {
    
    // Create a Pair to represent object : number and its frequency
    static class Pair {
        
        int number;
        int frequency;
        
        public Pair(int number, int frequency) {
            
            this.number = number;
            this.frequency = frequency;
        }
    }
    
    public int[] topKFrequent(int[] nums, int k) {
        
        // Create a map to store number (key) and its frequency (value)
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int num : nums) {
            
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        
        // Create a PQ and provide custom sorting based on Pair.frequency (min heap style)
        PriorityQueue<Pair> pQueue = new PriorityQueue<>((num1, num2) -> num1.frequency - num2.frequency);
        
        // Start adding to PQ and if PQ size goes over k, poll. This will remove the top (least frequent number)
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            
            pQueue.add(new Pair(m.getKey(), m.getValue()));
            
            if (pQueue.size() > k) {
                
                pQueue.poll();
            }
        }
        
        // Finally get the result from the remaining elements in PQ
        int[] result = new int[k];
        
        for (int i=0; i<k; i++) {
            
            result[i] = pQueue.poll().number;    
        }
        
        return result;
    }
}
