public class MaxSumInArray {

	public static int maxSum(int[] arr) {
		
		int sum = 0;
		
		int min = Integer.MIN_VALUE;
		
		for (int i=0; i<arr.length; i++) {
			
			if (arr[i] > -1) {
				
				sum = sum + arr[i];
			}
			
			if (arr[i] > min) {
				
				min = arr[i];
			}
		}
		
		if (sum == 0) {
			
			return min;
			
		} else {
			
			return sum;
		}
	}
	
	public static void main(String[] args) {
		
		//int[] arr = new int[] {-1, 2, 3, -2, 6, -5};
		
		//int[] arr = new int[] {-8, -2, -3, -1, -9, -5};
		
		int[] arr = new int[] {0,0,0,0,0,0,0,0};
		
		System.out.println(maxSum(arr));
	}
}
