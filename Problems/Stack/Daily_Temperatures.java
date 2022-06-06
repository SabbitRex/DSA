# https://leetcode.com/problems/daily-temperatures/

class Daily_Temperatures {
    
    public int[] dailyTemperatures(int[] temperatures) {
        
        Stack<Integer[]> monotonicStack = new Stack<Integer[]>();
        
        int[] result = new int[temperatures.length];
        
        for (int i=0; i<temperatures.length; i++) {
            
            while (!monotonicStack.isEmpty() && monotonicStack.peek()[0] < temperatures[i]) {
                
                Integer[] top = monotonicStack.pop();
                
                int tempIndex = i - top[1];
                
                result[top[1]] = tempIndex;
            }
            
            monotonicStack.push(new Integer[] {temperatures[i], i});
        }
        
        return result;
    }
}
