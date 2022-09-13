# https://leetcode.com/problems/pascals-triangle/

class Pascals_Triangle {
    
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> result = new ArrayList<>();
        
        List<Integer> previous = new ArrayList<>();
        
        for (int i=0; i<numRows; i++) {
            
            List<Integer> current = new ArrayList<>();
            
            for (int j=0; j<=i; j++) {
                
                if (j==0 || j==i) {
                    
                    current.add(1);
                    
                } else {
                    
                    current.add(previous.get(j) + previous.get(j-1));
                }
            }
            
            previous = current;
            result.add(current);
        }
        
        return result;
    }
}
