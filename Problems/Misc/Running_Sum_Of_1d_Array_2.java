# https://leetcode.com/problems/running-sum-of-1d-array/submissions/

class Running_Sum_Of_1d_Array_2 {
    
    public int[] runningSum(int[] arr) {
        
		for (int i=1; i<arr.length; i++) {
			
			arr[i] = arr[i] + arr[i-1];
		}
		
		return arr;
    }
}
