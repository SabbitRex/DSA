class Find_Even_Number_Count_In_Array_Iterative_Linear {
    
    public int findNumbers(int[] nums) {
        
        int count = 0;
        
        for (int num : nums) {
                
             if (String.valueOf(num).length() % 2 == 0) {
                 
                 count++;
             }   
        }
        
        return count;
    }
}
