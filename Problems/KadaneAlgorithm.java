public class KadaneAlgorithm {

	public static int maxSubArray(int[] arr) {
		
		int localMax = 0;
		
		int globalMax = Integer.MIN_VALUE;
		
		for (int num : arr) {
			
			if (num + localMax < num) {
				
				localMax = num;
				
			} else {
				
				localMax = num + localMax;
			}
			
			if (globalMax < localMax) {
				
				globalMax = localMax;
			}
		}
		
		return globalMax;
	}
	
	public static void main(String[] args) {

		int[] arr = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		//int[] arr = new int[] { 5, 4, -1, 7, 8 };

		System.out.println(maxSubArray(arr));
	}
}
