# https://leetcode.com/problems/merge-intervals/

class Merge_Intervals {
    
    public int[][] merge(int[][] intervals) {
    
        // Sort based on intervals[index][0]
        Arrays.sort(intervals, (interval1, interval2) -> Integer.compare(interval1[0], interval2[0]));
        
        List<int[]> result = new ArrayList<>();
        
        // Remember initial pair
        int[] initialPair = intervals[0];
        
        // Get initial start idx and end idx
        int initialStart = initialPair[0];
        int initialEnd = initialPair[1];
        
        int idx = 0;
        
        // Merge overlaps
        while (idx < intervals.length) {
            
            int[] current = intervals[idx];
            
            int currentStart = current[0];
            int currentEnd = current[1];
            
            if (currentStart <= initialEnd) {
                
                initialEnd = Math.max(initialEnd, currentEnd);
                
            } else {
                
                result.add(new int[] {initialStart, initialEnd});
                
                initialStart = currentStart;
                
                initialEnd = currentEnd;
            }
            
            idx++;
        }
        
        result.add(new int[] {initialStart, initialEnd});
        
        return result.toArray(new int[result.size()-1][]);
    }
}
