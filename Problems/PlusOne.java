class PlusOne {
    
    public int[] plusOne(int[] digits) {

    	List<Integer> list = new ArrayList<Integer>();
    	
        int carry = 0;
        
        for (int i=digits.length - 1; i>=0; i--) {
            
            if (i == (digits.length - 1)) {
                
                int sum = digits[digits.length-1] + 1;
        
                int unit = sum % 10;

                carry = sum / 10;
                
                list.add(unit);
                
            } else {
            	
            	int sum = digits[i] + carry;
            	
                int unit = sum % 10;

                carry = sum / 10;
                
                list.add(unit);
            }
        }
        
        if (carry != 0) {
        	
        	list.add(carry);
        }
        
        int[] result = new int[list.size()];
        
        int size = list.size() - 1;
        
        for (int num : list) {
            
            result[size] = num;
            size--;
        }
        
        return result;
    }
}
