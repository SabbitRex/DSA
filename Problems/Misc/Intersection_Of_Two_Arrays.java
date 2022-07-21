# https://leetcode.com/problems/intersection-of-two-arrays/

class Intersection_Of_Two_Arrays {
    
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Set<Integer> num2Set = new HashSet<>();
        
        for (int num : nums2) {
            
            num2Set.add(num);
        }
        
        List<Integer> list = new ArrayList<>();
        
        for (int num : nums1) {
            
            if (num2Set.contains(num)) {
                
                list.add(num);
                num2Set.remove(num);
            }
        }
        
        int[] result = new int[list.size()];
        
        int idx = 0;
        
        for (int num : list) {
            
            result[idx] = num;
            idx++;
        }
        
        return result;
    }
}
