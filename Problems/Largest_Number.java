# https://leetcode.com/problems/largest-number/

class Largest_Number {
    
    public String largestNumber(int[] nums) {
        
        String[] numbers = new String[nums.length];
        
        for (int i=0; i<nums.length; i++) {
            
            numbers[i] = String.valueOf(nums[i]);
        }
        
        Arrays.sort(numbers, new Comparator<String>() {
            
            public int compare(String  num1, String num2) {
                
                return (num2+num1).compareTo(num1+num2);
            }
        });
        
        boolean isAllZero = false;
        
        for (String num : numbers) {
            
            if (!num.equals("0")) {
                
                isAllZero = false;
                break;
                
            } else {
                
                isAllZero = true;
            }
        }
        
        if (isAllZero) {
            
            return "0";
        }
        
        StringBuilder builder = new StringBuilder();
        
        for (String num : numbers) {
            
            builder.append(num);       
        }
        
        return builder.toString();
    }
}
