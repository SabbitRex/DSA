class Plus_One_Modulo_Divide {
    
    public int[] plusOne(int[] digits) {

        List<Integer> list = new ArrayList<>();
        
        int size = digits.length-1;
        
        int sum = digits[size] + 1;
        
        int unitPlace = sum % 10;
        
        int carry = sum / 10;
        
        size--;
        
        list.add(unitPlace);
        
        while (size>=0) {
            
            sum = digits[size] + carry;
            
            unitPlace = sum % 10;
        
            carry = sum / 10;
            
            list.add(unitPlace);
            
            size--;
        }
        
        if (carry != 0) {
            
            list.add(carry);
        }
        
        digits= new int[list.size()];
        
        int count = 0;
        
        for (int i=list.size()-1; i>=0; i--) {
            
            digits[count] = list.get(i);
            count++;
        }
        
        return digits;
    }
}
