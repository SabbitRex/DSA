# https://leetcode.com/problems/relative-sort-array/

class Relative_Sort_Array_TreeMap {
    
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
        int[] result = new int[arr1.length];
        
        TreeMap<Integer, Integer> arr1Map = new TreeMap<>();
        
        for (int i=0; i<arr1.length; i++) {
            
            if (arr1Map.containsKey(arr1[i])) {
                
                arr1Map.put(arr1[i], arr1Map.get(arr1[i]) + 1);
                
            } else {
                
                arr1Map.put(arr1[i], 1);
            }
        }
        
        int idx = 0;
        
        for (int i=0; i<arr2.length; i++) {
            
            int current = arr2[i];
            
            while (arr1Map.get(current) > 0) {
                
                result[idx] = current;
                
                arr1Map.put(current, arr1Map.get(current) - 1);
                
                idx++;
            }
            
            arr1Map.remove(current);
        }
        
        for (int num : arr1Map.keySet()) {
            
            int count = arr1Map.get(num);
            
            while (count > 0) {
                
                result[idx] = num;
                
                count--;
                idx++;
            }
        }
        
        return result;
    }
}
