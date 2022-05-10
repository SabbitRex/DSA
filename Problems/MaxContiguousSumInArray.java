public class MaxContiguousSumInArray {

	public static int maxSubArray(int[] arr) {

		int size = arr.length;

		int topMax = Integer.MIN_VALUE;

		for (int i = 0; i < size; i++) {

			int sum = arr[i];
			
			int currentMax = sum;

			for (int j = i + 1; j < size; j++) {

				sum = sum + arr[j];
				
				if (currentMax < sum) {

					currentMax = sum;
				}
			}

			if (currentMax > topMax) {

				topMax = currentMax;
			}
		}

		return topMax;
	}

	public static void main(String[] args) {

		//int[] arr = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		int[] arr = new int[] { 5, 4, -1, 7, 8 };

		System.out.println(maxSubArray(arr));
	}
}
