# https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

class Two_Sum_II_Two_Pointer {
    
    public int[] twoSum(int[] numbers, int target) {
        
        int i = 0;
        int j = numbers.length - 1;
        
        while (i < j) {
            
            int sum = numbers[i] + numbers[j];
            
            if (sum == target) {
                
                break;
            }
            
            if (sum < target) {
                
                i++;
                continue;
            }
            
            j--;
        }
        
        return new int[] {i + 1, j + 1};
    }
}
