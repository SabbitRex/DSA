# https://leetcode.com/problems/pascals-triangle/

class Pascals_Triangle {
    
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> result = new ArrayList<>();
        
        List<Integer> previousRow = new ArrayList<>();
        
        for (int i=0; i<numRows; i++) {
            
            List<Integer> currentRow = new ArrayList<>();
            
            for (int j=0; j<=i; j++) {
            
                if (j==0 || j == i) {

                    currentRow.add(1);

                } else {

                    currentRow.add(previousRow.get(j-1) + previousRow.get(j));
                }
            }
            
            previousRow = currentRow;
            result.add(currentRow);
        }
        
        return result;
    }
}
