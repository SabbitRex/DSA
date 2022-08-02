# https://leetcode.com/problems/merge-intervals/

class Merge_Intervals {
    
    public int[][] merge(int[][] intervals) {
    
        Arrays.sort(intervals, (A, B) -> Integer.compare(A[0], B[0]));
        
        int[] initialPair = intervals[0];
        
        int initStart = initialPair[0];
        int initEnd = initialPair[1];
        
        List<int[]> result = new ArrayList<>();
        
        for (int i=1; i<intervals.length; i++) {
            
            int[] currentPair = intervals[i];
            
            int currentStart = currentPair[0];
            int currentEnd = currentPair[1];
            
            if (initEnd >= currentStart) {
                
                initEnd = Math.max(initEnd, currentEnd);
                
            } else {
                
                result.add(new int[] {initStart, initEnd});
                
                initStart = currentStart;
                initEnd = currentEnd;
            }
        }
        
        result.add(new int[] {initStart, initEnd});
        
        return result.toArray(new int[result.size() - 1][]);
    }
}
