# https://leetcode.com/problems/triangle/

# This code works for small test cases BUT I wrote this when I was studying/learning about recursion and memorization using stack. Please excuse.
  
class Triangle_Recusion_NOT_WORKING {
    
    int minPathSoFar = Integer.MAX_VALUE;
    
    public int minimumTotal(List<List<Integer>> triangle) {
        
        Stack<Integer> stack = new Stack<>();
        
        boolean[] isTaken = new boolean[triangle.size()];
        
        recurse(0, 0, 0, stack, isTaken, triangle);
        
        return minPathSoFar;
    }
    
    private void recurse(int start, int end, int level, Stack<Integer> stack, boolean[] isTaken, List<List<Integer>> triangle) {
        
        if (stack.size() == triangle.size()) {
            
            int localSum = 0;
            int idx = 0;
            
            while (idx != stack.size()) {
                
                localSum = localSum + stack.get(idx);   
                idx++;
            }
            
            if (localSum < minPathSoFar) {
                
                minPathSoFar = localSum;
            }
            
            return;
        }
        
        for (int i=start; i<=end; i++) {
            
            if (isTaken[level] == false) {
                
                stack.add(triangle.get(level).get(i));
                isTaken[level] = true;
                level++;
                recurse(i, i+1, level, stack, isTaken, triangle);
                level--;
                isTaken[level] = false;
                stack.pop();
            }
        }
    } 
}
