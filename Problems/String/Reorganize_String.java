# https://leetcode.com/problems/reorganize-string/

class Reorganize_String {
    
    public String reorganizeString(String s) {
        
        Map<Character, Integer> frequencyMap = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            
            if (frequencyMap.containsKey(c)) {
                
                frequencyMap.put(c, frequencyMap.get(c) + 1);
                
            } else {
                
                frequencyMap.put(c, 1);
            }
        }
        
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> frequencyMap.get(b) - frequencyMap.get(a));
        
        maxHeap.addAll(frequencyMap.keySet()); // Based on frequency of char in hash map, create a max heap of char (max to min).
        
        StringBuilder builder = new StringBuilder();
        
        while (maxHeap.size() > 1) {
            
            char firstMostCountChar = maxHeap.remove();
            
            char secondMostCountChar = maxHeap.remove();
            
            builder.append(firstMostCountChar);
            builder.append(secondMostCountChar);
            
            frequencyMap.put(firstMostCountChar, frequencyMap.get(firstMostCountChar) - 1);
            
            frequencyMap.put(secondMostCountChar, frequencyMap.get(secondMostCountChar) - 1);
            
            if (frequencyMap.get(firstMostCountChar) != 0) {
                
                maxHeap.add(firstMostCountChar);
            }
            
            if (frequencyMap.get(secondMostCountChar) != 0) {
                
                maxHeap.add(secondMostCountChar);
            }
        }
        
        if (!maxHeap.isEmpty()) {
            
            char c = maxHeap.remove();
            
            if (frequencyMap.get(c) > 1) {
                
                return "";
            }
            
            builder.append(c);
        }
        
        return builder.toString();
    }
}
