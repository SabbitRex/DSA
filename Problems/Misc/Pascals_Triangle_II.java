# https://leetcode.com/problems/pascals-triangle-ii/

class Pascals_Triangle_II {
    
    public List<Integer> getRow(int rowIndex) {
        
        List<Integer> result = new ArrayList<>();
        
        for (int i=0; i<=rowIndex; i++) {
            
            List<Integer> current = new ArrayList<>();
            
            for (int j=0; j<=i; j++) {
                
                if (j == 0 || j == i) {
                    
                    current.add(1);
                    
                } else {
                    
                    current.add(result.get(j) + result.get(j-1));
                }
            }
            
            result = current;
        }
        
        return result;
    }
}
